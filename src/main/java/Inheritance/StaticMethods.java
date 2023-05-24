package Inheritance;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class StaticMethods {
    public static void m(){}
    class Super {
        public static void f(){
            System.out.println("super::f");
        }
    }

    class Child extends  Super {
        public static void f(){
            System.out.println("child::f");
        }
    }
    public static void main(String[] args) {
        StaticMethods.m();
        Super.f();
        Child.f();
//        new StaticMethods().new Child().f();
    }
}
