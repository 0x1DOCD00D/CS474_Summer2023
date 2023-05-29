import BlocksOfCode.a

/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object BlocksOfCode:
  lazy val someBlock = {
    val x = 3
    println("initializing someBlock")
  }
  val x = {
    val p2: Int=>Int = (i:Int)=>i*i
    val p1: Int=>Int = (i:Int)=>i*i
    val p: Int=>Int = (i:Int)=>i*i
    println("initializing x")
    (i:Int) => p(p1(p2(i)))
  }

  def f(p: => Int) =
    println("just entered f")
    println(p)

  def WhileGood4CS474(cond: => Boolean)(block: => Unit): Unit = {
    if cond then block else println("Ouch!")
  }

  val a = 3
  val b = 1

  def `this Method Takes a block Of Code As Its Input Parameter`(
                                                                block: Int=>Int,
                                                                p: Int
                                                                ): Int =
    block(p)


  @main def runMain_BlocksOfCode(): Unit =
    /*
    * initializing x
    Evaluating p
    just entered f
    8
    *
    * initializing x
    just entered f
    Evaluating p
    8
    *  */
/*
    lazy val p = {
      println("Evaluating p")
      5 + 3
    }
    f(p)
*/
    WhileGood4CS474(a < b) {
      println("got it!")
    }

//    println(`this Method Takes a block Of Code As Its Input Parameter`(x,3))
//    println(x(5))
