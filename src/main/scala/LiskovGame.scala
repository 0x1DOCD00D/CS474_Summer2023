import LiskovGame.C1

/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object LiskovGame:
  class C1
  class C2 extends C1
  class C3 extends C2
  class C4 extends C3
  class C5 extends C4

  @main def runMain_LiskovGame(): Unit =
    type NOTSTRING = String => Nothing
    var a:2|3 = 2
    if (a =3) == () then println("yes") else println("no")
    lazy val os:String = throw new Exception()
//    val o: C2 = (new C1).asInstanceOf[C2]
//    println(os)

  