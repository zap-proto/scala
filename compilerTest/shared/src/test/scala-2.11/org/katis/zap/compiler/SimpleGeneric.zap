using Scala = import "../../../../../../../../../scala.zap";

@0xb14f277ff320a8c5;

$Scala.package("org.katis.zap.compiler");
$Scala.module("SimpleGeneric");

struct GenericMap(Key, Value) {
  entries @0 :List(Entry);
  struct Entry {
    key @0 :Key;
    value @1 :Value;
  }
}

struct User {
  name @0 :Text;
  age @1 :Int8;
}