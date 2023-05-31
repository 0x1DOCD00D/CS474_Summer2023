package Parametric;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */
import java.sql.SQLException;

public class M<T extends Exception> {
    private void throwIt( final Exception t ) throws Exception {
        throw (Exception)t;
    }

    public static void main(String[] args) {
        try {
            new M<RuntimeException>().throwIt(new SQLException());

        } catch(final Exception ex){
            System.out.println(ex);
//            ex.printStackTrace();
        }
    }
}
