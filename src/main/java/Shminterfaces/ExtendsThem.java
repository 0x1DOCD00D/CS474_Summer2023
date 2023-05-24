package Shminterfaces;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class ExtendsThem {
    interface I1{
        final int i_i1 = 3;
    }

    interface I2{
        class X{}
    }
    interface I3{
        void f_i3();
    }

    interface X extends I1, I2, I3{}

    class Y implements X {
        @Override
        public void f_i3() {
            System.out.println(i_i1);
        }
    }

    public static void main(String[] args) {
        new I2.X();
       new ExtendsThem(). new Y();
    }
}
