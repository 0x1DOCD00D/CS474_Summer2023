package Shminterfaces;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class DepInjection {
    public int field = 10;
    interface Database {
        boolean connect();
        String runQuery();
    }
    class SqlServer implements Database{
        public int field = 20;
        @Override
        public boolean connect() {
            return DepInjection.this.field == 10;
        }

        @Override
        public String runQuery() {
            return null;
        }
    }
/*    class Oracle{}
    class MySql{}*/
    class ExtractStudentDataFromDb {
        protected boolean connected = false;
        protected Database currentDb = null;
        public ExtractStudentDataFromDb(Database dbi){
            currentDb = dbi;
        }
        public void connect(){
            connected = currentDb.connect();
        }
        public String extract(){
            return "blah";
        }

    }

    public static void main(String[] args) {
        new DepInjection().new ExtractStudentDataFromDb(new DepInjection().new SqlServer());
        System.out.println("");
    }
}
