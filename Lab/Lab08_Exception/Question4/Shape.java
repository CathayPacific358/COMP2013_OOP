/**
 * 
 * @author Frank Ng
 *
 */

public abstract class Shape {

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
	
	public void move(double dx, double dy) {//function to move the shape
		x = x + dx;
		y = y + dy;
	}
	
	public abstract double area();//function to calculate area, use abstract because do not know what the shape is
	
	public abstract void resize(double newSize) throws CannotResizeException;//function to change size, use abstract because do not know what the shape is
	
	public static void testShape() {
		//leave blank as no object can be created
	}
}
