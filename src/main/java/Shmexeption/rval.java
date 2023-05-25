package Shmexeption;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class rval {
       boolean rv(){
              try{
                     /*int i = 3;
                     if(i == 3)return false;
                     int b = i + 5;
                     return true;*/
                     return false;
              }
              catch(Exception e){
                     return true;
              }
              finally {
                     return true;
              }
       }
       public static void main(String[] args) {
              rval r = new rval();
              System.out.println(r.rv());
       }
 
}
