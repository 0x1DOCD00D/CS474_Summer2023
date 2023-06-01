/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object BasicFuncIter:
  def f[T](p:T=>T): T=>T =
    (i:T)=>p(i)

  val computation = f(f(f(_:Int=>Int)))

  val unrollIt: Int => Int = (i:Int) => ((i:Int) =>((i:Int) => i+1)(i))(i)

  val listOfNames = List("Mohammed", "Al", "Luis", "Kiryl", "Eddie")
  val f: String =>Int = (i:String)=>i.length
  def conv(s:String):Int = s.length
  val ff: String =>Int = conv

  val listOfNameLengths = listOfNames.map(f)
  @main def runMain_BasicFuncIter$(): Unit =
    println(computation(x=>x+1)(7))
    println(unrollIt(7))
