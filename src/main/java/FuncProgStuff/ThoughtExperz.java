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
        int accept(int p);
    }
    class X {
        public int fieldx = 10;
        public X f(Y y){
            y.fieldy = 30;
            return new X();
        }

        public IComputeSquareValue Z(){
            return (int p) -> p *5;
        }
        public X h(IComputeSquareValue is, int p){
            System.out.println(is.accept(p));
            return new X();
        }
    }

    class Y {
        public int fieldy = 10;
        public Y g(X x){
            x.fieldx = 50;
            return new Y();
        }
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
        int s = 10;
        class Q {
            public static IComputeSquareValue returnLambdaFunction(){
                return (int p)->p*p;
            }
        }
/*
        System.out.println(new ThoughtExperz().new X().Z().accept(8));
        new ThoughtExperz().new X().h((int p)-> p*3, 7);
*/

/*
        new ThoughtExperz().new X().h(new IComputeSquareValue() {
            @Override
            public int square(int p) {
                return p*2;
            }
        }, 7);
*/

/*
        System.out.println(
                new ThoughtExperz().new X().f(
                        new ThoughtExperz(). new Y()).fieldx);
*/
/*
        auto f = (int p)->p*p;
        System.out.println(f(6));
*/

        IComputeSquareValue f = Q.returnLambdaFunction();
        System.out.println(f.accept(6));

/*
        System.out.println(new ThoughtExperz().
                new SquareComputation().square(6));
*/
    }
}
