package Shminterfaces;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class ImplementationAbstractInt {
    abstract class Vehicle{
        abstract void drive();
        void breakIt(){

        }

    }

    interface Vehicle1{
        abstract void drive();

    }

    class Ferrari implements Vehicle1 {
        @Override
        public void drive() {
            
        }
    }

    public static void main(String[] args) {
       new ImplementationAbstractInt(). new Ferrari();
    }
}
