import ConAndContra.{MyStorage, MyStorageCV}

/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object ConAndContra:
  case class MyStorage[T](var v1:T, var v2: T):
    def get: (T,T) = (v1, v2)
    def set(x:T, pos:Int) =
      if pos ==1 then v1 = x else v2 = x
  end MyStorage

  case class MyStorageCV[+T](val v1: T, val v2: T):
    def get: (T, T) = (v1, v2)

    def set[U >: T](x: U, pos: Int): MyStorageCV[U] =
      if pos == 1 then MyStorageCV(x, v2) else MyStorageCV(v1, x)
  end MyStorageCV


@main def runMain_ConAndContra(): Unit =
    val ms: MyStorage[Any] = MyStorage("cs474", "Summer2023")
    ms.set(10,2)
    println(ms)

//    val ms1: MyStorageCV[Any] = MyStorageCV[String]("cs474", "Summer2023")
    val ms2 = MyStorageCV[String]("cs474", "Summer2023").set(10, 2)
    println(ms2)

