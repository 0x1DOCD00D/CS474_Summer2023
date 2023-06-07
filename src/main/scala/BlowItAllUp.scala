/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object BlowItAllUp:
  val listOfFunctions = List.fill(1_000_000)((i:Int)=>i+1)
  def composeFunctions(lof:List[Int=>Int]): Int=>Int =
    lof match
      case Nil => (x:Int)=>x
      case hd::tl => hd andThen(composeFunctions(tl))
  end composeFunctions

  @main def runMain_BlowItAllUp(): Unit =
//    println(listOfFunctions)
//    println(composeFunctions(listOfFunctions)(0))
    println(listOfFunctions.foldLeft(0)((acc, f)=> f(acc)))
