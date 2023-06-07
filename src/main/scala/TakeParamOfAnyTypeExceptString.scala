import TakeParamOfAnyTypeExceptString.TypeNegation

/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

object TakeParamOfAnyTypeExceptString:
  trait TypeNegation[A, B]

//  type T ==> T => Nothing

  given aPureDud[A, B]: TypeNegation[A,B] = new TypeNegation[A,B] {}

  given createConflict1[A, B >: A]: TypeNegation[A,B] with {}

  given createConflict2[A, B >: A]: TypeNegation[A, B] with {}

  def someMethod[T](v: T)(using ev: T TypeNegation String) = ev

  @main def runMain_TakeParamOfAnyTypeExceptString(): Unit =
    println(someMethod(10))
    println(someMethod(List("mark")))
//    println(someMethod("mark"))
