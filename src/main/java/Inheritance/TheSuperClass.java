package Inheritance;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class TheSuperClass {
    public void m(int p){
        System.out.println("Super: "+p);
    }
    public static void main(String[] args) {
        ChildClass co = new ChildClass();
        co.m(3,2);
    }
}

class ChildClass extends TheSuperClass{
/*
    public void m(int p){
        System.out.println("Child: "+p);
    }
*/
    public void m(int p, int q){
        System.out.println("Child: "+(p+q));
    }
}