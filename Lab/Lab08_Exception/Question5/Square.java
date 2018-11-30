/**
 * 
 * @author Frank Ng
 *
 */

public class Square extends Rectangle {

	public Square(double x, double y, double size) {//constructor
		super(x, y, size, size);
	}
	
	public static void testSquare() {
		Square s1 = new Square(1.0, 2.0, 2.0);
		
		System.out.println(s1.getX() == 1.0);//test get X
		System.out.println(s1.getY() == 2.0);//test get Y
		System.out.println(s1.area() == 4.0);//test area
		s1.resize(3.0);//test resize
		System.out.println(s1.area() == 9.0);//test area after resize
	}
}
