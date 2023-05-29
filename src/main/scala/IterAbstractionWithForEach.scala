/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object IterAbstractionWithForEach:
  case class Student(name:String)
  val lstOfAttendees: List[(Student, Double)] = List(
    (Student("Kiryl"), 1.1),
    (Student("Sagi"), 2.2),
    (Student("Muhammad"), 3.3),
    (Student("Kathleen"), 4.4),
    (Student("Al"), 1.2)
  )
  
  @main def runMain_IterAbstractionWithForEach(): Unit =
    lstOfAttendees.foreach(student => println(student(1)))
