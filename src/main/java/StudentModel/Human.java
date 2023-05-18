package StudentModel;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class Human {
    boolean biosex;

    void m(){
        ;
    }
    boolean getsex(){
        int x = 1;
        {
            int y = 1 + x;
        }
        class X{
            boolean getsex(){
                return biosex;
            }
        }
        return new X().getsex();
    }
    public Human(boolean bs){
        biosex = bs;
    }
}

