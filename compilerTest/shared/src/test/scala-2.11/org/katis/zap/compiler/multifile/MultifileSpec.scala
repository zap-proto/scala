package org.katis.zap.compiler.multifile

import java.util.{UUID => JavaUUID}

import order._
import org.katis.zap.runtime.MessageBuilder
import org.katis.zap.runtime.implicits._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import util.uuid._

class MultifileSpec extends AnyFlatSpec with Matchers {
  // Deterministic, distinct UUIDs. `UUID.randomUUID()` is intentionally avoided:
  // it is not linkable under Scala.js (its impl references java.security.SecureRandom,
  // which the Scala.js java library does not provide). The two-long constructor is
  // supported on both JVM and JS, and the test only needs distinct round-tripped values.
  private def uuid(msb: Long, lsb: Long): JavaUUID = new JavaUUID(msb, lsb)

  "A multi-file schema" should "work normally" in {
    val builder = new MessageBuilder()
    val order = builder.getRoot[Order]
    val orderId = uuid(0x1111111111111111L, 0x2222222222222222L)
    order.init.id().put(orderId)

    val customerId = uuid(0x3333333333333333L, 0x4444444444444444L)
    val customer = order.init.customer()
    customer.init.id().put(customerId)
    customer.name = "Vin Diesel"

    val items = Vector(
      ("Carrots", uuid(0x5555555555555555L, 0x6666666666666666L)),
      ("Milk",    uuid(0x7777777777777777L, 0x8888888888888888L)),
      ("Dogfood", uuid(0x9999999999999999L, 0xaaaaaaaaaaaaaaaaL))
    )
    for ((item, (name, id)) <- order.init.items(items.size).zip(items)) {
      item.init.id().put(id)
      item.name = name
    }

    val reader = order.asReader

    reader.id.toJava == orderId
    assert(reader.customer.id.toJava == customerId)
    assert(reader.customer.name.toString == "Vin Diesel")

    for ((item, (name, id)) <- reader.items.zip(items)) {
      assert(item.id.toJava == id)
      assert(item.name.toString == name)
    }
  }

  implicit class UUIDBuilderExt(val uuid: UUID#Builder) {
    def put(id: JavaUUID) = {
      uuid.lsb = id.getLeastSignificantBits
      uuid.msb = id.getMostSignificantBits
    }
  }

  implicit class UUIDExt(val uuid: UUID#Reader) {
    def toJava: JavaUUID = new JavaUUID(uuid.msb, uuid.lsb)
  }
}
