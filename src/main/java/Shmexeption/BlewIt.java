package Shmexeption;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

class BlewIt extends Exception {
          BlewIt() { }
          BlewIt(String s) { super(s); }
}
class Test {
          static void blowUp() throws BlewIt {
                      throw new NullPointerException();
//                      throw new BlewIt();
              
          }
          public static void main(String[] args) {
                      try {
                                  blowUp();
                      } catch (BlewIt b) {
                                  System.out.println("Caught BlewIt");
                      } finally {
                                  System.out.println("Uncaught Exception");
                      }
          }
}

