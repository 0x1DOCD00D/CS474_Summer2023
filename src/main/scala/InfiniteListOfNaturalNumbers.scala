/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object InfiniteListOfNaturalNumbers:
  lazy val block = {
    println("Block is called!")
    2+3
  }

  def infiniteLazyList(i:Int): LazyList[Int] = i #:: infiniteLazyList(i+1)

  @main def runMain_InfiniteListOfNaturalNumbers(): Unit =
    println(infiniteLazyList(0).take(1000).toList)
