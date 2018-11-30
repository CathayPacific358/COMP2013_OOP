/**
 * 
 * @author Frank Ng
 *
 */

public class Rectangle extends Shape{

	private double width;
	private double length;
	
	public Rectangle(double x, double y, double width, double length) {//constructor
		super(x, y);//inherited from parent class Shape
		this.width = width;
		this.length = length;
	}
	
	@Override//override the function area
	public double area() {
		return width * length;
	}
	
	@Override
	public String toString() {
		return "Rectangle has area " + this.area();
	}
	
	public static void testRectangle() {
		Rectangle rec1 = new Rectangle(1.0, 2.0, 3.0, 4.0);//object for test
		
		System.out.println(rec1.getX() == 1.0);//test getX
		System.out.println(rec1.getY() == 2.0);//test getY
		System.out.println(rec1.area() == 3.0 * 4.0);//test area of rectangle
	}
}
