/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object NewWay2HandleErrors:
  def simpleFunc(a:Int, b:Int): (Option[Int], String) =
    if a == 0 || b == 0 then (None, "div by zero")
    else (Some(a/b + b/a), "")

  @main def runMain_NewWay2HandleErrors(): Unit =
    val lst = List((3,2), (1,0))
    simpleFunc(3,0) match
      case (None, s) => println(s)
      case (Some(x), _) => println(x)
