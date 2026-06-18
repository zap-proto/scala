package org.katis.zap.compiler

import java.lang.ProcessBuilder
import java.nio.channels.{Channels, ReadableByteChannel}
import java.nio.file.{Files, Path, Paths}

import org.katis.zap.compiler.schema._
import org.katis.zap.runtime.implicits._
import org.katis.zap.runtime.Serialize

import scala.collection.JavaConverters._
import scala.language.postfixOps
import scala.sys.process._

object Compiler {

  def main(args: Array[String]): Unit = {
    val outDir = Paths.get(System.getenv().getOrDefault("OUT_DIR", "."))

    if (args.length > 0) {
      val zapc = compiler(args:_*)
      val proc = zapc.start()
      val input = Channels.newChannel(proc.getInputStream)
      run(input, outDir)
      input.close()
    } else {
      println("Running as a plugin, waiting for input.")
      val input = Channels.newChannel(stdin)
      run(input, outDir)
    }
  }

  def compiler(files: String*): ProcessBuilder = {
    val params = Seq("zap", "compile", "-o", "-") ++ files
    val zapc = new ProcessBuilder(params:_*)
    zapc.redirectError(ProcessBuilder.Redirect.INHERIT)
    zapc
  }

  def fileGenerator(file: String): Generator = {
    val zapc = compiler(file)
    val proc = zapc.start()
    val input = Channels.newChannel(proc.getInputStream)

    val messageReader = Serialize.read(input)
    val request = messageReader.getRoot[CodeGeneratorRequest]
    new Generator(request)
  }

  def run(chan: ReadableByteChannel, outputDirectory: Path): Unit = {
      val messageReader = Serialize.read(chan)

      val request = messageReader.getRoot[CodeGeneratorRequest]
      val generator = new Generator(request)

      for (requestedFile <- request.requestedFiles) {
        val filePath = outputDirectory.resolve(requestedFile.filename.toString + ".scala")
        val output = generator.generateOutput(requestedFile.id)

        Files.write(filePath, output.asJava)
      }
  }
}
