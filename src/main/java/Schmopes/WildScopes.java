package Schmopes;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class WildScopes {
    public int field = 0;
    {
        int i = 0;
        {
            field = 10;

        }
    }
    {
        System.out.println(field);
    }
    {
        int field = 1;

        System.out.println(field);
    }
    {
        System.out.println(field);
    }
    public WildScopes(int i){
        field = i;
        class Y{
            int x = field;
        }
        System.out.println("Constructor: "+ field);
    }
    {
        System.out.println("After the constructor: " + field);
    }

    public static void main(String[] args) {
        new WildScopes(2);
    }
}
