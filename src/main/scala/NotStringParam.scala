/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object NotStringParam:
  sealed trait NotAString[X]

  object NotAString {
    implicit def StringIsNotValClass1[X <: String]: NotAString[X] = new NotAString[X] {}
    implicit def StringIsNotValClass2[X <: String]: NotAString[X] = new NotAString[X] {}
    implicit def AnyWorks[X <: Any]: NotAString[X] = new NotAString[X] {}
  }

  def anyTypeButString[X: NotAString](z: X) = z

  import scala.util.NotGiven

  def iDontLikeStrings[T: [T] =>> NotGiven[T =:= String]](t: T) = ()
  @main def runMain_NotStringParam(): Unit =
//    println(anyTypeButString("howdy!"))
    println(anyTypeButString(474))
//    println(iDontLikeStrings("howdy"))
    println(iDontLikeStrings(474))

