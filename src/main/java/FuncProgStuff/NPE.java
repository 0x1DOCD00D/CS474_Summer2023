package FuncProgStuff;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

import java.util.ArrayList;

public class NPE {
    String npeMethod(){
        return null;
    }
    public static void main(String[] args) {
        String a = new NPE().npeMethod();

        System.out.println(a.toLowerCase());
    }
}
