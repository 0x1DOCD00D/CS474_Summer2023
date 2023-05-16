/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

trait Forklift(weight:Int, wheelbase:Float):
  def lift(load:Int): Boolean

class MovingForklift(weight:Int, wheelbase:Float) extends Forklift(weight, wheelbase):
  override def lift(load: Int): Boolean = true
  def move:Int = 1
  def fly: Boolean  = false

class Student

object RunForklift:
  @main def runMain_RunForklift(): Unit =
    println(new MovingForklift(1,2).lift(3))
    new Student
