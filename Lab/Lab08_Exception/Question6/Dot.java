/**
 * 
 * @author Frank Ng
 *
 */

public class Dot extends Shape {

	public Dot(double x, double y) {//constructor
		super(x,y);
	}
	
	@Override
	public double area() {//the area of a dot is 0.0
		return 0.0;
	}
	
	@Override
	public void resize(double newSize) throws CannotResizeException{
		throw new CannotResizeException("Cannot resize a dot!");//throw a new exception
	}
	
	public static void testDot() {
		Dot d1 = new Dot(1.0, 2.0);
		
		try {
			d1.resize(1.0);
		}catch(CannotResizeException e) {//catch the exception
			System.out.println(e.getMessage() == "Cannot resize a dot!");
		}
	}
}
