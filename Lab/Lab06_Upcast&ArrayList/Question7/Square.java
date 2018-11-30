/**
 * 
 * @author Frank Ng
 *
 */

public class Square extends Rectangle{
	
	public Square(double x, double y, double size) {//constructor
		super(x, y, size, size);//inherited from rectangle
	}
	
	@Override
	public String toString() {
		return "Square has area " + this.area();
	}
	
	public static void testSquare() {
		Square square1 = new Square(1.0, 2.0, 3.0);
		
		System.out.println(square1.getX() == 1.0);//test getX
		System.out.println(square1.getY() == 2.0);//test getY
		System.out.println(square1.area() == 3.0 * 3.0);//test the area of square
	}
}
