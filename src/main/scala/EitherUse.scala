/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object EitherUse:
  case class MyError(err:String)
  def computeMean(l: List[Double]): Either[MyError, Double] =
    l match
      case Nil => Left(MyError("Idiot, your list is empty!"))
      case _ => Right(l.sum/l.length)
  end computeMean

  @main def runMain_EitherUse(): Unit =
    val res = computeMean(List(3d, 5d, 10d))
    val `bam!!` = computeMean(List())
    res match
      case Left(e) => println(e)
      case Right(v) => println(v)
    res.foreach(println)
    `bam!!`.foreach(println)
    `bam!!`.map(r => println(r))
    `bam!!` match
      case Left(e) => println(e)
      case Right(v) => println(v)
