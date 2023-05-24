/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object Shtraits:
  class Alex:
    def drinksWater():Unit = println("tastes great!")
  trait Exercise:
    def liftWeight():Unit = println("feels great!")

  class ExercisingALex extends Exercise

  @main def runMain_Shtraits$(): Unit =
    val o1 = new Alex
    val o2 = new Alex
    val o3 = new ExercisingALex
    val o4 = new Alex with Exercise {}
    println(o4.liftWeight())
