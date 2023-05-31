/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object YCombinator:
  val fact = (f:Int=>Int)=>(n:Int)=>if n == 0 then 1 else n*f(n-1)
  def Y(g: (Int=>Int) => (Int=>Int)): Int => Int = (i:Int)=>g(Y(g))(i)

/*  def factorial(n:Int):Int =
    require(n>=0)
    if n == 0 then 1 else n*factorial(n-1)*/

  def hof(f: Int => Int, n:Int):Int = f(n)

  @main def runMain_YCombinator(): Unit =
    val yfact = Y((f:Int=>Int)=>(n:Int)=>if n == 0 then 1 else n*f(n-1))
    println(yfact)
    println(yfact(5))
/*
    println(hof((n:Int)=>{
      if n == 0 then 1 else n*factorial(n-1)
    }, 5))
*/
