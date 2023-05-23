/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object DynamicBindingStuff:
  class C1:
    def m1 = println("C1")

  class C2 extends C1:
    def m2: Unit = println("C2")

  class C3 extends C2:
    def m3: Unit = println("C3")

  def MyDynamicDispatch(o:Any): Unit =
    if o.isInstanceOf[C1] then o.asInstanceOf[C1].m1
    else if o.isInstanceOf[C2] then o.asInstanceOf[C2].m2
    else if o.isInstanceOf[C3] then o.asInstanceOf[C3].m3
    else println("ouch!")

  @main def runMain_DynamicBindingStuff$(): Unit =
    MyDynamicDispatch(new C2)
    println(DynamicBindingStuff.getClass.getName)

