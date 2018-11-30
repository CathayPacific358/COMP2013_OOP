/**
 * 
 * @author Frank Ng
 *
 */

public class Square extends Rectangle {

	
	public Square(double x, double y, double size) {//constructor
		super(x, y, size, size);
	}
	
	@Override
	public void resize(double width, double length) {
		if(width == length) {
			super.resize(width);
		}else {
			try {
				throw new CannotResizeException("Cannot resize a square into a rectangle!");
			} catch (CannotResizeException e) {
				System.out.println(e.getMessage() == "Cannot resize a square into a rectangle!");
			}
		}
	}
	
	public static void testSquare() {
		Square s1 = new Square(1.0, 2.0, 2.0);
		
		System.out.println(s1.getX() == 1.0);//test get X
		System.out.println(s1.getY() == 2.0);//test get Y
		System.out.println(s1.area() == 4.0);//test area
		s1.resize(3.0);//test resize
		System.out.println(s1.area() == 9.0);//test area after resize
		s1.resize(4.0, 4.0);//test resize with two same input
		System.out.println(s1.area() == 16.0);//test area after two same input resize
		s1.resize(3.0, 4.0);//test resize with two different input
	}
}
