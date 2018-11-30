/**
 * 
 * @author Frank Ng
 *
 */

public class Circle extends Shape {

	private double radius;
	
	public Circle(double x, double y, double radius) {//constructor
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public double area() {//override to calculate circle's area
		return Math.PI * radius * radius;
	}
	
	@Override
	public void resize(double newRadius) {//override to use radius to change size
		this.radius = newRadius;
	}
	
	public static void testCircle() {
		Circle c1 = new Circle(1.0, 2.0, 2.0);
		
		System.out.println(c1.getX() == 1.0);//test get X
		System.out.println(c1.getY() == 2.0);//test get Y
		System.out.println(c1.radius == 2.0);//test radius
		System.out.println(c1.area() == Math.PI * 2.0 * 2.0);//test area
		c1.resize(4.0);//test resize
		System.out.println(c1.radius == 4.0);//test radius after resize
		System.out.println(c1.area() == Math.PI * 4.0 * 4.0);//test area after resize
		c1.move(1.0, 1.0);//test move
		System.out.println(c1.getX() == 2.0);//test X after move
		System.out.println(c1.getY() == 3.0);//test Y after move
		
	}
}
