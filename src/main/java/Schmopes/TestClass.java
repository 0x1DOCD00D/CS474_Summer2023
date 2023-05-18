package Schmopes;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class TestClass {
    int y = 1;
    public TestClass(){  
        y = 2;  f();  }
    void f () {
        System.out.println("Value = " + String.valueOf(y));}
    public static class B extends TestClass {
        int y = 3;
        public B(){ 
            f(); }
        void f () {
            System.out.println("Value = " + String.valueOf(y));}
    }
    public static void main(String[] args) {
        TestClass o = new TestClass.B ();
//        print 2
//        print 3
    }}
