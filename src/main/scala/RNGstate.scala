import scala.util.Random

/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object RNGstate:
//  trait RNG:
  def f():(Random, Int) =
    val o: Random = new Random(1)
    (o, o.nextInt())

  def muh(p:(Random, Int)): (Random, Int)=
    (p._1, p._1.nextInt())

  def mrk(p: (Random, Int)): (Random, Int) =
    (p._1, p._1.nextInt())

  @main def runMain_RNGstate(): Unit =
    println(mrk(muh(f())))

