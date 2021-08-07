
package Test_1;
abstract class Shape{
	public abstract Shape copy();
}

class Circle extends Shape{
	public Circle(int x, int y, int radius) { /*initialize fields here **/}
	public Shape copy() {
		return null; /*return a copy of this object */}
}
public class Test {
	public static void main(String[] args) {
		Circle c1=new Circle(10,21,30);
		Circle c2=new (Cirle)c1.copy();
	}

}
