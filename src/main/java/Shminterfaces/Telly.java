package Shminterfaces;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public interface Telly {
    boolean on();
    boolean off();
    int volume_up();

    public static void main(String[] args) {
        System.out.println("");
    }
}

interface Computer extends Telly{
    class Sean{
        interface Al{}
    }
}
