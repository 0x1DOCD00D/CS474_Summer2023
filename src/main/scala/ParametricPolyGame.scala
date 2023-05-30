/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object ParametricPolyGame:
  class Student
/*  val f = (i:Int)=>i
  val f1 = (i:Float)=>i
  val f2 = (i:String)=>i
  val f3 = (i:Student)=>i*/
  def genericFunc[T](i:T): T = i



  @main def runMain_ParametricPolyGame(): Unit =
    println(genericFunc(5))
    println(genericFunc(5.5f))
    println(genericFunc("5.5f"))
    println(genericFunc(new Student))

