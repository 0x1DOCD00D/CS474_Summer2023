package Schmopes;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class PassMethodsFunction {
    public Runnable m = () -> System.out.println("dd");
/*
    int m((void -> int) p){
       p();
    }
*/
    public static void main(String[] args) {
        new PassMethodsFunction().m.run();
    }
}
