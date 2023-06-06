import java.util

/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object MyFunctorImpl:
  trait MyFunctor[Container[_]]:
    def map[From,To <: From](storage: Container[From])(f: From=>To):Container[To]

  class MyFunctorList extends MyFunctor[util.ArrayList]:
    override def map[From, To <: From](storage: util.ArrayList[From])(f: From => To): util.ArrayList[To] =
      val newArrList = new util.ArrayList[To]()
      val len = storage.size()
      var i:Int = 0
      while(i < len){
        val elem = storage.get(i)
        newArrList.add(i, f(elem))
        i = i + 1
      }
      newArrList

  @main def runMain_MyFunctorImpl(): Unit =
    val al = new util.ArrayList[String]()
    al.add("Asvin")
    al.add("Amaan")
    println((new MyFunctorList).map(al)(e=>e.length))

