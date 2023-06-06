/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object MonalLaws:
  val monadicType = Option(474)
  trait TestMonads[F[_]]:
    val f: Int =>F[Int] //(elem:Int)=>F(elem)
//    val leftIdentityLaw = F(474).flatMap(f) == f(474)
  object OptionMonadTest extends TestMonads[Option]:
    override val f: Int => Option[Int] = (elem:Int)=>Option(elem+1)
    val g: Int => Option[Int] = (elem:Int)=>Option(elem*2)
    val leftIdentityLaw = Option(474).flatMap(f) == f(474)
    val rightIdentityLaw = Option(474).flatMap(v=>Option(v))== Option(474)
    val assocLaw = Option(474).flatMap(f).flatMap(g)  == f(474).flatMap(g)

  @main def runMain_MonalLaws(): Unit =
    println(OptionMonadTest.leftIdentityLaw)
    println(OptionMonadTest.rightIdentityLaw)
    println(OptionMonadTest.assocLaw)
