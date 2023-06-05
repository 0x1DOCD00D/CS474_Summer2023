package FuncProgStuff;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

class SideEffectClass {
    public static Boolean sideEffectVariable = false;
}
public class SideEffects {
    public int g(int j){
        if( j%2 == 0 && SideEffectClass.sideEffectVariable) {
            SideEffectClass.sideEffectVariable = true;
        } else {
            SideEffectClass.sideEffectVariable = false;
        }
        return j%2+1;
    }
    public int h(int j){
        if( j%2+1 == 0 && SideEffectClass.sideEffectVariable) {
            SideEffectClass.sideEffectVariable = false;
        } else {
            SideEffectClass.sideEffectVariable = true;
        }
        return j%2-1;
    }

    public static void main(String[] args) {
        SideEffects o = new SideEffects();
        if(5 > o.h(2)){
//        if(o.h(2) <= o.g(3)){
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}
