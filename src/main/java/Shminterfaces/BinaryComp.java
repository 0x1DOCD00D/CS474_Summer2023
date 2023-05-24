package Shminterfaces;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

import scala.Int;

public class BinaryComp {
    interface I{
        void f();
//        void g();
    }
    class RunIt implements I {
        public void f() {

        }

        public void g() {

        }
    }

    public static void main(String[] args) {
        new BinaryComp().new RunIt();
    }
}
