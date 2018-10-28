/**
 * 
 * @author Frank Ng
 *
 */

public class CepesALaBordelaise extends BoletusEdulis{

	public CepesALaBordelaise() {//constructor
		super("brown", 500);
	}
	
	public static void testCepesALaBordelaise() {
		CepesALaBordelaise CALB1 = new CepesALaBordelaise();
		
		System.out.println(CALB1.getColour() == "brown");//test get colour
		System.out.println(CALB1.getPrice() == 500);//test get price
		System.out.println(CALB1.isEdible() == true);//test function isEdible
	}
}
