# zap-proto/scala

> **Docs:** [ZAP Scala SDK](https://zap-proto.dev/docs/sdks) · part of the [ZAP Protocol](https://zap-proto.io)

Scala 3 / Scala.js implementation of ZAP (Zero-copy App Proto). Idiomatic case classes, opaque types for zero-allocation reads.

## Install

```scala
// build.sbt
libraryDependencies += "io.zap-proto" %% "zap" % "0.1.0"
```

## Generate code

```bash
zap compile -o ./src/main/scala/gen --scala schema/*.zap
```

## Encode / decode

```scala
import zap.proto.*

@main def run() =
  val msg = gen.Message(id = 42, name = "hello")
  val bytes = msg.toBytes
  val decoded = gen.Message.fromBytes(bytes)
  println(s"\${decoded.id} \${decoded.name}")
```

## License

MIT
