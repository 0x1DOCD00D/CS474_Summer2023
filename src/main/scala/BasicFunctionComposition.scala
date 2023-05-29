/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object BasicFunctionComposition:
//  f: String => Int
//  g: Int => Int
//  f compose g => g(f("sss"))
  def functionCombinator(f: String => Int, g: Int => Int): String => Int =
    (s: String) => g(f(s))

  @main def runMain_BasicFunctionComposition(): Unit =
    println(functionCombinator(f = (i:String)=>i.length, g = (i:Int)=>i+1)("Al Kaleshi") )
