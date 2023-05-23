package Inheritance;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class PolyGame {
    static class Parent {
        public int i = 10;
        void m(int i){
            System.out.println("Parent: " + i);
        }
    }
    
    static class Child extends Parent{
        public int i = 30;
        void m(int i){
            System.out.println("Child: " + i);
        }
    }



    public static void main(String[] args) {
        class S1{}
        class T1 extends S1{}
        PolyGame.Parent o = new PolyGame.Child();
//        PolyGame.Child c = (Child) new Parent();
        T1 t1 = (T1) new S1();
        System.out.println(t1.getClass().getName());
        
    }
}
