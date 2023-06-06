/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object MonadExperiments:
  val objList = List((s:String)=>s.length)
  val objInts = List(5,10)


  @main def runMain_MonadExperiments(): Unit =
//    List(List(6, 7), List(11, 12)) for map
    println("cs474 in Summer 2023".flatMap(c=>c.toString))
    println(objInts.flatMap((i:Int)=>List(i+1, i+2)))
    println(objList.flatMap(f=>List((s:String)=>f(s))))
    println(objList.flatMap(f=>List(f("Aswin"))))
