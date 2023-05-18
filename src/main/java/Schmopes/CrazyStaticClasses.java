package Schmopes;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class CrazyStaticClasses {
    static class S1 {
        static class S2 {
            class NS1 {
                static class S3{
                    static class S4{
                        class NS2 {
                            class NS3{}

                        }
                    }
                }
            }
        }
        class InnerClass {
            static class S5{}
        }
    }
    public static void main(String[] args) {
//        how do I instantiate the class NS2
//        NS2 -> S4 -> S3 -> NS1 -> S2 -> S1 -> CrazyStaticClasses
        CrazyStaticClasses.S1.S2.NS1.S3.S4.NS2 o = new CrazyStaticClasses.S1.S2.NS1.S3.S4().new NS2();
        CrazyStaticClasses.S1.S2.NS1.S3.S4.NS2.NS3 o1 = new CrazyStaticClasses.S1.S2.NS1.S3.S4().new NS2().new NS3();
        System.out.println(o);
    }
}
