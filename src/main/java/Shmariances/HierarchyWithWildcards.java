package Shmariances;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

import java.util.ArrayList;
import java.util.List;

class S{}
class C1 extends S{}
class C2 extends C1{}
class C3 extends C2{}
class C5 extends C3{}
class C4 extends C2{}

public class HierarchyWithWildcards {

    public static void main(String[] args) {
//        RHS starts
        ArrayList<C3> arc2 = new ArrayList<C3>();
//        arc2.add(new C2());
        arc2.add(new C3());
//        RHS ends
        List<? extends C2> lhsObj1 = arc2;
        C2 c2 = lhsObj1.get(1);
        List<? super C3> lhsObj2 = arc2;
        lhsObj2.add(new C5());

    }
}
