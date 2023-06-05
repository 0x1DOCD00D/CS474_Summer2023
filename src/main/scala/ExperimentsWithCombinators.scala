/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object ExperimentsWithCombinators:
  case class Wrapper[T](v: T)

  case class Trampoline[T](thunk: () => T)

  def run[T](delayed: Trampoline[T]): T =
    delayed.thunk()

  def pure[T](v:T): Wrapper[T] =
    Wrapper(v)

  def map[T, S](coll: Wrapper[T])(f: T=>S): Wrapper[S] = pure(f(coll.v))

  @main def runMain_ExperimentsWithCombinators(): Unit =
    val delayedComp = Trampoline(()=>5)
    println(delayedComp)
    println(run(delayedComp))
/*    val res = "Luis".length
    val coll = map(pure("Luis"))((s:String)=>s.length)//List("Luis")
    println(coll)*/
