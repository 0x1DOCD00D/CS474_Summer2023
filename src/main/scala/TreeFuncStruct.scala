/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object TreeFuncStruct:
//  data BinaryTree ::= Root v Left Right Leaf
  trait Tree[T]
  case class BinaryNode[T](left: Tree[T], right: Tree[T], v:T) extends Tree[T]
  case class Leaf[T](v:T) extends Tree[T]

  def map[F,T](tree:Tree[F])(f:F=>T): Tree[T] = tree match
    case Leaf(v) => Leaf(f(v))
    case BinaryNode(l, r, v) => BinaryNode(map(l)(f),map(r)(f),f(v))

  @main def runMain_TreeFuncStruct(): Unit =
    val root = BinaryNode(
      BinaryNode(Leaf("Kathleen"), Leaf("Kiryl"), "Luis"),
      BinaryNode(Leaf("Mark"),Leaf("Mo"),"Robert"),
      "Joseph"
    )
    val rootTransformed = map(root)((s:String)=>s.length)
    println(root)
    println(rootTransformed)

