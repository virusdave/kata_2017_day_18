// https://adventofcode.com/2017/day/18
// TODO(dave): Use a Tagless Final approach for this.

import enumeratum._

sealed trait Arity { def numParams: Int }
sealed trait Unary extends Arity { def numParams = 1 }
sealed trait Binary extends Arity { def numParams = 2 }
sealed trait BinaryFirstLiteral extends Binary

sealed abstract class Instruction(entryName: String) extends EnumEntry with Arity
object Instruction extends Enum[Instruction] {
  case object PlayFrequency extends Instruction("snd") with Unary
  case object SetRegister extends Instruction("set") with Binary
  case object AddRegister extends Instruction("add") with Binary
  case object MultiplyRegister extends Instruction("mul") with Binary
  case object ModuloRegister extends Instruction("mod") with Binary
  case object ReceiveFrequency extends Instruction("rcv") with Unary
  case object JumpIfGreaterThanZero extends Instruction("jgz") with Binary

  override lazy val values = findValues
}

type Registers = Map[String, Int]

class RegisterOrLiteral(id: String) {
  def value(state: Registers) = {
    if (id.toInt.toString == id) id.toInt
    else state.getOrElse(id, 0)
  }
}

class ProgramState {

}

class VM {

}