package Inheritance;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class OverridingEx {
    class Parent {
        void f(double p){
            System.out.println("Parent: " + p);
        }
    }
    
    class Child extends Parent {
        void f(float p){
            System.out.println("Child: " + p);
        } 
    }
    public static void main(String[] args) {
        OverridingEx.Child o = new OverridingEx().new Child();
        o.f(3.14);
    }
}
