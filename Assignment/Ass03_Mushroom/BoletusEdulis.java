/**
 * 
 * @author Frank Ng
 *
 */

public class BoletusEdulis extends Boletus {

	public BoletusEdulis(String colour, int price) {//constructor 1
		super(colour, price);
	}
	
	public BoletusEdulis(String colour) {//constructor 2
		super(colour, 100);
	}
	
	public static void testBoletusEdulis() {
		BoletusEdulis BE1 = new BoletusEdulis("white", 200);//test constructor 1
		BoletusEdulis BE2 = new BoletusEdulis("yellow");//test constructor 2
		
		/* test for constructor 1 */
		System.out.println(BE1.getColour() == "white");
		System.out.println(BE1.getPrice() == 200);
		System.out.println(BE1.isEdible() == true);
		
		/* test for constructor 1 */
		System.out.println(BE2.getColour() == "yellow");
		System.out.println(BE2.getPrice() == 100);
		System.out.println(BE2.isEdible() == true);
		
	
	}
}
