/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object FunctionGameTime:
  val _f = (i:Int)=>i+1
  val ff = (i:Int)=> _f(_f(i))// (i:Int)=> _f(_f(i))(5) => _f(_f(5)) =>
//  _f(((i:Int)=>i+1)(5)) => _f(6) => (i:Int)=>i+1 (6) => 7

  def applySomeFuncNTimes(f: Int => Int, howManyTimes: Int): Int => Int =
    require(howManyTimes >= 0)
    if howManyTimes == 0 then (z:Int)=>z+2
    else (i:Int)=>applySomeFuncNTimes(f, howManyTimes-1)(f(i))
//applySomeFuncNTimes((i:Int)=>i+1, 3) =>

  class MyIncrement extends Function1[Int, Int] {
    override def apply(v1: Int): Int = v1+1
  }

  @main def runMain_FunctionGameTime(): Unit =
    println(applySomeFuncNTimes((i:Int)=>i+1, 5)(5))
//    println(((i:Int)=>i+1)(5))
/*
    println(_f(_f(2)))
    println((new MyIncrement).apply((new MyIncrement).apply(2)))
*/

