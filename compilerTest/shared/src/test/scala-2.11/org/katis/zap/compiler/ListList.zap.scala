// GENERATED ZAP FILE, DO NOT EDIT
package org.katis.zap.compiler

import org.katis.zap.runtime.implicits._

object contents {
  // START Contents implicits
  implicit val Contents$$HasTypeId = new org.katis.zap.runtime.HasTypeId[Contents] {
    def typeId: Long = -3160189064124843233L
  }
  implicit val Contents$$HasStructSize = new org.katis.zap.runtime.HasStructSize[Contents] {
    val structSize = new org.katis.zap.runtime.StructSize(0, 1)
  }
  implicit val Contents$$StructFromSegment = new org.katis.zap.runtime.StructFromSegment[Contents] {
    def readerFromSegment(segment: org.katis.zap.runtime.SegmentReader, dataOffset: Int, pointers: Int, dataSize: Int, pointerCount: Short, nestingLimit: Int): Contents#Reader = {
      Contents.Reader(segment, dataOffset, pointers, dataSize, pointerCount, nestingLimit)
    }
    def builderFromSegment(segment: org.katis.zap.runtime.SegmentBuilder, dataOffset: Int, pointers: Int, dataSize: Int, pointerCount: Short): Contents#Builder = {
      Contents.Builder(segment, dataOffset, pointers, dataSize, pointerCount)
    }
  }
  // END Contents implicits

  object Contents extends Contents
  sealed class Contents private() extends org.katis.zap.runtime.Struct { 
    val typeId: Long = -3160189064124843233L
    override val structSize: org.katis.zap.runtime.StructSize = new org.katis.zap.runtime.StructSize(0, 1)

    override type Reader = ReaderImpl
    override type Builder = BuilderImpl

    override val Builder: (org.katis.zap.runtime.SegmentBuilder, Int, Int, Int, Short) => Builder = new BuilderImpl(_, _, _, _, _)
    override val Reader: (org.katis.zap.runtime.SegmentReader, Int, Int, Int, Short, Int) => Reader = new ReaderImpl(_, _, _, _, _, _)

    class ReaderImpl(_segment: org.katis.zap.runtime.SegmentReader, _dataOffset: Int, _pointers: Int, _dataSize: Int, _pointerCount: Short, _nestingLimit: Int) extends super.ReaderBase(_segment, _dataOffset, _pointers, _dataSize, _pointerCount, _nestingLimit) {
      def entries: org.katis.zap.runtime.ListList[org.katis.zap.runtime.TextList]#Reader = {
        _getPointerField[org.katis.zap.runtime.ListList[org.katis.zap.runtime.TextList]](0)
      }
      object has {
        def entries: Boolean = {
          _pointerFieldIsNull(0)
        }
      }
    }
    class BuilderImpl(_segment: org.katis.zap.runtime.SegmentBuilder, _dataOffset: Int, _pointers: Int, _dataSize: Int, _pointerCount: Short) extends super.BuilderBase(_segment, _dataOffset, _pointers, _dataSize, _pointerCount) {
      def entries: org.katis.zap.runtime.ListList[org.katis.zap.runtime.TextList]#Builder = {
        _getPointerField[org.katis.zap.runtime.ListList[org.katis.zap.runtime.TextList]](0)
      }
      def entries_=(value: org.katis.zap.runtime.ListList[org.katis.zap.runtime.TextList]#Reader): Unit = {
        _setPointerField[org.katis.zap.runtime.ListList[org.katis.zap.runtime.TextList]](0, value)
      }
      object has {
        def entries: Boolean = {
          _pointerFieldIsNull(0)
        }
      }
      object init {
        def entries(size: Int): org.katis.zap.runtime.ListList[org.katis.zap.runtime.TextList]#Builder = {
          _initPointerField[org.katis.zap.runtime.ListList[org.katis.zap.runtime.TextList]](0, size)
        }
      }
    }
  }
}
