package Shmexeption;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class NormallyAbruptly {
    public static int finallyTest() {
        int x = 3;//line 0
        try {
            try {
                ++x;//line 1
                if (true & true | false)
                    throw new RuntimeException("Argh!!"); //line 2
                return x--; //line 3
            } catch (Throwable e) {
                return --x;//line 4
            } finally {
                ++x;//line 5
            }
        } catch (RuntimeException e) {
            return x++;//line 6
        } finally {
            ++x;//line 7
        }
    }

    public static void main(String[] args) {
        System.out.println(NormallyAbruptly.finallyTest());
    }
}

