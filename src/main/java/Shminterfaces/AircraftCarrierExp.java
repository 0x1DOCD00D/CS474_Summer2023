package Shminterfaces;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class AircraftCarrierExp {
    interface Ship{}
    interface Airport{}
    interface Hospital{}
    class AC implements Ship,Airport{
        
    }

    public static void main(String[] args) {
 /*       Hospital i = new AircraftCarrierExp().new AC() mix in Hospital;
        new AircraftCarrierExp().new AC();*/
    }
}
