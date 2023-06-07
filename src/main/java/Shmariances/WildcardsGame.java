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

public class WildcardsGame {
    public static void storeValues(List<? super Integer>lst){
        lst.add(3);
    }

    public static Integer obtainValues(List<? extends Integer>lst){
        return lst.get(0);
    }
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        storeValues(ints);
//        List<? super Number> newList = ints;
//        newList.add(3.14F);
        System.out.println(ints);
    }
}
