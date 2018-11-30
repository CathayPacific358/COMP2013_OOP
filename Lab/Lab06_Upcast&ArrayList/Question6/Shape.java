/**
 * 
 * @author Frank Ng
 *
 */

public class Shape {

	private double x;
	private double y;
	
	public Shape(double x, double y) {//constructor
		this.x = x;
		this.y = y;
	}
	
	public double getX() {//function to get X
		return x;
	}
	
	public double getY() {//function to get Y
		return y;
	}
	
	public double area() {//function to calculate area
		System.out.println("An unknown shape has an unknown area!");
		return -1.0;
	}
	
	public static void testShape() {
		Shape unknownShape = new Shape(1.0, 2.0);//a object for test
		
		System.out.println(unknownShape.getX() == 1.0);//test getX
		System.out.println(unknownShape.getY() == 2.0);//test getY
		System.out.println(unknownShape.area() == -1.0);//test area()
		
	}
	
}
