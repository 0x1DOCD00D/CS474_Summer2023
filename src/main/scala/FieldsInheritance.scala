/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object FieldsInheritance:
  class Parent:
    val i:Int = 10;

  class Child extends Parent:
    override val i:Int = 30;


  @main def runMain_FieldsInheritance(): Unit =
    val o: Parent = new Parent
    println(o.i)
