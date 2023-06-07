import scala.annotation.tailrec

/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object RecursionWithTails:
/*  def sum(ip:List[Int]):Int =
    ip match
      case hd::tl => hd + sum(tl)
      case Nil => 0*/

  @tailrec
  def sum(ip: List[Int], acc:Int): Int =
    ip match
      case hd :: tl => sum(tl, acc+hd)
      case Nil => acc

  @main def runMain_RecursionWithTails(): Unit =
    val lst = List.fill(1_000_000)(1)
//    println(sum(List(1,2,3,4,5)))
    println(sum(lst,0))
