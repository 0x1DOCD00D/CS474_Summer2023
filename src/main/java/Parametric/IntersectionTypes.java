package Parametric;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class IntersectionTypes {
    interface Human {
        void steal();
    }
    interface Robot {
        void useElectricity();
    }

    public <T extends Human & Robot> void hybridWorks(T o){
        o.steal();
        o.useElectricity();
    }

    public static void main(String[] args) {
        class Eddie implements Human {
            @Override
            public void steal() {
                System.out.println("Nooo!");
            }
        }
        interface Fullminator extends Human, Robot{
            @Override
            default void steal() {
                System.out.println("steal");
            }

            @Override
            default void useElectricity() {
                System.out.println("power hungry");
            }
        }
        new IntersectionTypes().hybridWorks(new Fullminator(){});
//        new IntersectionTypes().hybridWorks(new Eddie());
    }
}
