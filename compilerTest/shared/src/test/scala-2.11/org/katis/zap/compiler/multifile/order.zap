using Scala = import "../../../../../../../../../../scala.zap";

@0x91eddc4a25fb62b3;

$Scala.package("org.katis.zap.compiler.multifile");
$Scala.module("order");

using import "customer.zap".Customer;
using import "util/uuid.zap".UUID;

struct Order {
  id @0 :UUID;
  customer @1 :Customer;
  items @2 :List(Item);
}

struct Item {
  id @0 :UUID;
  name @1 :Text;
}