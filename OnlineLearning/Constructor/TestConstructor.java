/* Constructor
 * author: Frank Ng
 */

//Name of Constructor shoubld be the same as the name of class
class Point{
	double x,y;
	
	public Point(double _x, double _y) {
		x = _x;
		y = _y;
	}

	public double getDistance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
}

public class TestConstructor {
	public static void main(String[] args) {
		Point p = new Point(3.0,4.0);//heads to "public Point"
		Point origin = new Point(0.0,0.0);//heads to "public Point"
		
		System.out.println(p.getDistance(origin));
	}
}
