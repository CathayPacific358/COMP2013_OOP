/**
 * 
 * @author Frank Ng
 *
 */

import java.util.ArrayList;

public class ManyShapes {

	private ArrayList<Shape> allShapes;
	
	public ManyShapes() {//constructor
		this.allShapes = new ArrayList<Shape>();
	}
	
	public void addShape(Shape s) {//function to add shape
		this.allShapes.add(s);
	}
	
	public void listAllShapes() {
		int i = allShapes.size();
		
		while(i - 1 >= 0) {//use i - 1 because index starts from 0
			Shape a = (Shape)allShapes.get(i - 1);//Upcast
			
			System.out.println(a.toString());
			//System.out.println(a.getClass().getName() + " has area " + a.area());
			i--;
		}
	}
	
	public static void testManyShapes() {
		ManyShapes m = new ManyShapes();
		
		m.addShape(new Circle(1.2, 3.4, 4.0));//Upcast from Circle to Shape.
		m.addShape(new Dot(1.2, 3.4)); // Upcast from Dot to Shape.
		m.addShape(new Rectangle(1.2, 3.4, 4.0, 5.0)); // Upcast from Rectangle to Shape.
		m.addShape(new Shape(1.2, 3.4));
		m.addShape(new Square(1.2, 3.4, 5.0)); // Upcast from Square to Shape.
		m.listAllShapes();
	}
}
