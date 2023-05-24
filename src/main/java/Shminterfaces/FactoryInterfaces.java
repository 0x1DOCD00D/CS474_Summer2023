package Shminterfaces;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class FactoryInterfaces {
    interface Phone {
        void call();
        boolean sms(String msg);
    }

    class iPhone implements Phone{
        @Override
        public void call() {
            System.out.println("calling from iphone");
        }

        @Override
        public boolean sms(String msg) {
            return false;
        }
    }
    class Samsung implements Phone{
        @Override
        public void call() {
            System.out.println("calling from smsung");
        }

        @Override
        public boolean sms(String msg) {
            return true;
        }
    }

    class PhoneFactory {
        public Phone getPhone(int i){
            if( i == 1 ) return new iPhone();
            else if(i == 2) return new Samsung();
            else return null;
        }
    }

    public static void main(String[] args) {
        PhoneFactory f = new FactoryInterfaces(). new PhoneFactory();
        Phone phone = f.getPhone(2);
        phone.call();

/*        o: Phone = factory.getPhone(3);
        o.call();
        o.sms("blah");*/
    }
}
