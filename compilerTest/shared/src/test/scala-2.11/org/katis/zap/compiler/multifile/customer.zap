using Scala = import "../../../../../../../../../../scala.zap";

using import "util/uuid.zap".UUID;

@0xb9bea4c26be48feb;

$Scala.package("org.katis.zap.compiler.multifile");
$Scala.module("customer");

struct Customer {
  id @0 :UUID;
  name @1 :Text;
}

