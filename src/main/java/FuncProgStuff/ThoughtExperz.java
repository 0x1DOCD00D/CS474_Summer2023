package FuncProgStuff;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class ThoughtExperz {
/*
    FunctionType f = (p1, p2, p3) -> p1(p2) + p3;
    f((g->g+g), 1, 2); //(1+1)+2
*/
    interface IComputeSquareValue {
        int square(int p);
    }
/*
    class SquareComputation implements IComputeSquareValue{
        @Override
        public int square(int p) {
            return p*p;
        }
    }
*/

    public static void main(String[] args) {
        IComputeSquareValue f = (int p)->p*p;
        System.out.println(f.square(6));

/*
        System.out.println(new ThoughtExperz().
                new SquareComputation().square(6));
*/
    }
}
