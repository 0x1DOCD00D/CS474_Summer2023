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
        PolyGame.Parent o = new PolyGame.Child();
        System.out.println(o.i);
        
    }
}
