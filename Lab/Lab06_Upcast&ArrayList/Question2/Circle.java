/**
 * 
 * @author Frank Ng
 *
 */

public class Circle extends Shape {

	private double radius;
	
	public Circle(double x, double y, double radius) {//constructor
		super(x, y);//inherited from parent class Shape
		this.radius = radius;
	}
	
	@Override
	public double area() {//function to calculate area
		return Math.PI * radius * radius;
	}
	
	public static void testCircle() {
		Circle circle1 = new Circle(2.0, 3.0, 4.0);
		
		System.out.println(circle1.getX() == 2.0);//test getX
		System.out.println(circle1.getY() == 3.0);//test getY
		System.out.println(circle1.area() == Math.PI * 4.0 * 4.0);//test area
	}
	
	
}
