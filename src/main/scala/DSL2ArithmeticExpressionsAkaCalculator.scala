/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object DSL2ArithmeticExpressionsAkaCalculator:
  val EnvTable: Map[String,Int] = Map("x"->5, "y"->3)
  enum ArithCalc:
    case Value(v:Int)
    case Variable(varName: String)
    case Add(o1: ArithCalc, o2: ArithCalc)
    case Mult(o1: ArithCalc, o2: ArithCalc)
    case Sub(o1: ArithCalc, o2: ArithCalc)

    def eval:Int = this match
      case Value(i) => i
      case Variable(name) => EnvTable(name)
      case Add(o1,o2) => o1.eval + o2.eval
      case Mult(o1,o2) => o1.eval * o2.eval
      case Sub(o1,o2) => o1.eval - o2.eval


  @main def runMain_DSL2ArithmeticExpressionsAkaCalculator$(): Unit =
    import ArithCalc.*
//    slamnonterm ::= add(slamnonterm,slamnonterm) | mult(slamnonterm,slamnonterm)
//    | Value(intvalue) | Variable(varname)
//    Add(Value(2), Mult(Variable("x"),5)).eval
    val myfirstexp = Sub(Variable("y"),Add(Value(2), Mult(Variable("x"),Value(5))))
    println(myfirstexp.eval)

