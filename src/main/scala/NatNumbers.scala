/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object NatNumbers:
  trait Nat
  case object Zero extends Nat
  case class Succ(prev:Nat) extends Nat

  def convFromArabic2Sticks(n:Int): Nat =
    if n == 0 then Zero else Succ(convFromArabic2Sticks(n-1))

  @main def runMain_NatNumbers(): Unit =
    println(convFromArabic2Sticks(7))
