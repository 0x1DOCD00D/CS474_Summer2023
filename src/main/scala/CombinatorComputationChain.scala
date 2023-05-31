/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object CombinatorComputationChain:
  val collectionOfSmthng = List(1,2,3,4,5)

  def expand(i:Int): List[Int] = List(i-1,i,i+1)
  def magnify(i:Int): Int = i*2
  def inc(i:Int): Int = i+1

  @main def runMain_CombinatorComputationChain(): Unit =
    println(collectionOfSmthng.filter(v=>v >3).map(expand))//.map(magnify).map(inc))
