package Inheritance;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public abstract class Shape {
    public abstract float area();

    public static void main(String[] args) {
        Shape [] arr = {
                new Circle(),
                new Rect(),
                new Triangle(),
                new Circle(),
                new Triangle()};
        int i = new CLI().getInput();
//        Rect o = new Rect() ;
        System.out.println(arr[i].area());
    }
}
// Shape :> Rect
class Rect extends Shape{
    @Override
    public float area() {
        return 1;
    }
}

class Circle extends Shape{
    @Override
    public float area() {
        return 2;
    }
}

class Triangle extends Shape{
    @Override
    public float area() {
        return 3;
    }
}
