/**
 * 
 * @author Frank Ng
 *
 */

public class Rectangle extends Shape {

	private double width;
	private double length;
	
	public Rectangle(double x, double y, double width, double length) {//constructor
		super(x, y);
		this.width = width;
		this.length = length;
	}
	
	@Override
	public double area() {//function to calculate area
		return width * length;
	}
	
	@Override
	public void resize(double newSize) {//1 input resize function
		this.width = newSize;
		this.length = newSize;
	}
	
	public static void testRectangle() {
		Rectangle r1 = new Rectangle(1.0, 2.0, 1.0, 2.0);
		
		System.out.println(r1.getX() == 1.0);//test get X
		System.out.println(r1.getY() == 2.0);//test get Y
		System.out.println(r1.area() == 2.0);//test area
		r1.resize(2.0);//test 1 input resize
		System.out.println(r1.area() == 4.0);//test area after 1 input resize
	}
	
	
}
