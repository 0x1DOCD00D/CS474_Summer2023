/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object ComputeSumOfListElements:
  trait Monoid[T]:
    val identity:T
    def op(o1:T, o2:T):T

  val lst = List(1,2,3,10,5,2,30,15)
  def mylistmap(l:List[Int]): List[Any] =
    l match
      case head ::  tail => (if head < 10 then head else "Error") :: mylistmap(tail)
      case List() => List()

  @main def runMain_ComputeSumOfListElements(): Unit =
    val result = lst.foldLeft(List[Any]())((acc,elem)=>(if elem < 10 then elem else "Error")::acc)
    println(result.reverse)
