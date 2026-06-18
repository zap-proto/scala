// GENERATED ZAP FILE, DO NOT EDIT
package org.katis.zap.compiler.multifile

import org.katis.zap.runtime.implicits._

object order {
  // START Order implicits
  implicit val Order$$HasTypeId = new org.katis.zap.runtime.HasTypeId[Order] {
    def typeId: Long = -7521475027206739292L
  }
  implicit val Order$$HasStructSize = new org.katis.zap.runtime.HasStructSize[Order] {
    val structSize = new org.katis.zap.runtime.StructSize(0, 3)
  }
  implicit val Order$$StructFromSegment = new org.katis.zap.runtime.StructFromSegment[Order] {
    def readerFromSegment(segment: org.katis.zap.runtime.SegmentReader, dataOffset: Int, pointers: Int, dataSize: Int, pointerCount: Short, nestingLimit: Int): Order#Reader = {
      Order.Reader(segment, dataOffset, pointers, dataSize, pointerCount, nestingLimit)
    }
    def builderFromSegment(segment: org.katis.zap.runtime.SegmentBuilder, dataOffset: Int, pointers: Int, dataSize: Int, pointerCount: Short): Order#Builder = {
      Order.Builder(segment, dataOffset, pointers, dataSize, pointerCount)
    }
  }
  // END Order implicits
  // START Item implicits
  implicit val Item$$HasTypeId = new org.katis.zap.runtime.HasTypeId[Item] {
    def typeId: Long = -1770797472075033903L
  }
  implicit val Item$$HasStructSize = new org.katis.zap.runtime.HasStructSize[Item] {
    val structSize = new org.katis.zap.runtime.StructSize(0, 2)
  }
  implicit val Item$$StructFromSegment = new org.katis.zap.runtime.StructFromSegment[Item] {
    def readerFromSegment(segment: org.katis.zap.runtime.SegmentReader, dataOffset: Int, pointers: Int, dataSize: Int, pointerCount: Short, nestingLimit: Int): Item#Reader = {
      Item.Reader(segment, dataOffset, pointers, dataSize, pointerCount, nestingLimit)
    }
    def builderFromSegment(segment: org.katis.zap.runtime.SegmentBuilder, dataOffset: Int, pointers: Int, dataSize: Int, pointerCount: Short): Item#Builder = {
      Item.Builder(segment, dataOffset, pointers, dataSize, pointerCount)
    }
  }
  // END Item implicits

  object Order extends Order
  sealed class Order private() extends org.katis.zap.runtime.Struct { 
    val typeId: Long = -7521475027206739292L
    override val structSize: org.katis.zap.runtime.StructSize = new org.katis.zap.runtime.StructSize(0, 3)

    override type Reader = ReaderImpl
    override type Builder = BuilderImpl

    override val Builder: (org.katis.zap.runtime.SegmentBuilder, Int, Int, Int, Short) => Builder = new BuilderImpl(_, _, _, _, _)
    override val Reader: (org.katis.zap.runtime.SegmentReader, Int, Int, Int, Short, Int) => Reader = new ReaderImpl(_, _, _, _, _, _)

    class ReaderImpl(_segment: org.katis.zap.runtime.SegmentReader, _dataOffset: Int, _pointers: Int, _dataSize: Int, _pointerCount: Short, _nestingLimit: Int) extends super.ReaderBase(_segment, _dataOffset, _pointers, _dataSize, _pointerCount, _nestingLimit) {
      def id: org.katis.zap.compiler.multifile.util.uuid.UUID#Reader = {
        _getPointerField[org.katis.zap.compiler.multifile.util.uuid.UUID](0)
      }
      def customer: org.katis.zap.compiler.multifile.customer.Customer#Reader = {
        _getPointerField[org.katis.zap.compiler.multifile.customer.Customer](1)
      }
      def items: org.katis.zap.runtime.StructList[org.katis.zap.compiler.multifile.order.Item]#Reader = {
        _getPointerField[org.katis.zap.runtime.StructList[org.katis.zap.compiler.multifile.order.Item]](2)
      }
      object has {
        def id: Boolean = {
          _pointerFieldIsNull(0)
        }
        def customer: Boolean = {
          _pointerFieldIsNull(1)
        }
        def items: Boolean = {
          _pointerFieldIsNull(2)
        }
      }
    }
    class BuilderImpl(_segment: org.katis.zap.runtime.SegmentBuilder, _dataOffset: Int, _pointers: Int, _dataSize: Int, _pointerCount: Short) extends super.BuilderBase(_segment, _dataOffset, _pointers, _dataSize, _pointerCount) {
      def id: org.katis.zap.compiler.multifile.util.uuid.UUID#Builder = {
        _getPointerField[org.katis.zap.compiler.multifile.util.uuid.UUID](0)
      }
      def id_=(value: org.katis.zap.compiler.multifile.util.uuid.UUID#Reader): Unit = {
        _setPointerField[org.katis.zap.compiler.multifile.util.uuid.UUID](0, value)
      }
      def customer: org.katis.zap.compiler.multifile.customer.Customer#Builder = {
        _getPointerField[org.katis.zap.compiler.multifile.customer.Customer](1)
      }
      def customer_=(value: org.katis.zap.compiler.multifile.customer.Customer#Reader): Unit = {
        _setPointerField[org.katis.zap.compiler.multifile.customer.Customer](1, value)
      }
      def items: org.katis.zap.runtime.StructList[org.katis.zap.compiler.multifile.order.Item]#Builder = {
        _getPointerField[org.katis.zap.runtime.StructList[org.katis.zap.compiler.multifile.order.Item]](2)
      }
      def items_=(value: org.katis.zap.runtime.StructList[org.katis.zap.compiler.multifile.order.Item]#Reader): Unit = {
        _setPointerField[org.katis.zap.runtime.StructList[org.katis.zap.compiler.multifile.order.Item]](2, value)
      }
      object has {
        def id: Boolean = {
          _pointerFieldIsNull(0)
        }
        def customer: Boolean = {
          _pointerFieldIsNull(1)
        }
        def items: Boolean = {
          _pointerFieldIsNull(2)
        }
      }
      object init {
        def id(): org.katis.zap.compiler.multifile.util.uuid.UUID#Builder = {
          _initPointerField[org.katis.zap.compiler.multifile.util.uuid.UUID](0, 0)
        }
        def customer(): org.katis.zap.compiler.multifile.customer.Customer#Builder = {
          _initPointerField[org.katis.zap.compiler.multifile.customer.Customer](1, 0)
        }
        def items(size: Int): org.katis.zap.runtime.StructList[org.katis.zap.compiler.multifile.order.Item]#Builder = {
          _initPointerField[org.katis.zap.runtime.StructList[org.katis.zap.compiler.multifile.order.Item]](2, size)
        }
      }
    }
  }

  object Item extends Item
  sealed class Item private() extends org.katis.zap.runtime.Struct { 
    val typeId: Long = -1770797472075033903L
    override val structSize: org.katis.zap.runtime.StructSize = new org.katis.zap.runtime.StructSize(0, 2)

    override type Reader = ReaderImpl
    override type Builder = BuilderImpl

    override val Builder: (org.katis.zap.runtime.SegmentBuilder, Int, Int, Int, Short) => Builder = new BuilderImpl(_, _, _, _, _)
    override val Reader: (org.katis.zap.runtime.SegmentReader, Int, Int, Int, Short, Int) => Reader = new ReaderImpl(_, _, _, _, _, _)

    class ReaderImpl(_segment: org.katis.zap.runtime.SegmentReader, _dataOffset: Int, _pointers: Int, _dataSize: Int, _pointerCount: Short, _nestingLimit: Int) extends super.ReaderBase(_segment, _dataOffset, _pointers, _dataSize, _pointerCount, _nestingLimit) {
      def id: org.katis.zap.compiler.multifile.util.uuid.UUID#Reader = {
        _getPointerField[org.katis.zap.compiler.multifile.util.uuid.UUID](0)
      }
      def name: org.katis.zap.runtime.Text#Reader = {
        _getPointerField[org.katis.zap.runtime.Text](1)
      }
      object has {
        def id: Boolean = {
          _pointerFieldIsNull(0)
        }
        def name: Boolean = {
          _pointerFieldIsNull(1)
        }
      }
    }
    class BuilderImpl(_segment: org.katis.zap.runtime.SegmentBuilder, _dataOffset: Int, _pointers: Int, _dataSize: Int, _pointerCount: Short) extends super.BuilderBase(_segment, _dataOffset, _pointers, _dataSize, _pointerCount) {
      def id: org.katis.zap.compiler.multifile.util.uuid.UUID#Builder = {
        _getPointerField[org.katis.zap.compiler.multifile.util.uuid.UUID](0)
      }
      def id_=(value: org.katis.zap.compiler.multifile.util.uuid.UUID#Reader): Unit = {
        _setPointerField[org.katis.zap.compiler.multifile.util.uuid.UUID](0, value)
      }
      def name: org.katis.zap.runtime.Text#Builder = {
        _getPointerField[org.katis.zap.runtime.Text](1)
      }
      def name_=(value: org.katis.zap.runtime.Text#Reader): Unit = {
        _setPointerField[org.katis.zap.runtime.Text](1, value)
      }
      def name_=(value: String): Unit = {
        _setPointerField[org.katis.zap.runtime.Text](1, org.katis.zap.runtime.Text.Reader(value))
      }
      object has {
        def id: Boolean = {
          _pointerFieldIsNull(0)
        }
        def name: Boolean = {
          _pointerFieldIsNull(1)
        }
      }
      object init {
        def id(): org.katis.zap.compiler.multifile.util.uuid.UUID#Builder = {
          _initPointerField[org.katis.zap.compiler.multifile.util.uuid.UUID](0, 0)
        }
        def name(size: Int): org.katis.zap.runtime.Text#Builder = {
          _initPointerField[org.katis.zap.runtime.Text](1, size)
        }
      }
    }
  }
}
