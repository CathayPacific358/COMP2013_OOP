/**
 * 
 * @author Frank Ng
 *
 */

public class Dot extends Shape {

	public Dot(double x, double y) {//constructor
		super(x, y);//inherited from parent class Shape
	}
	
	@Override//override the area function in Shape
	public double area() {
		return 0;//the area of a dot is 0
	}
	
	@Override
	public String toString() {
		return "Dot has area " + this.area();
	}
	
	public static void testDot() {
		Dot dot1 = new Dot(1.0, 2.0);
		
		System.out.println(dot1.getX() == 1.0);//test getX
		System.out.println(dot1.getY() == 2.0);//test getY
		System.out.println(dot1.area() == 0);//test the area of a dot
	}
}
