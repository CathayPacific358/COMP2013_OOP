/**
 * 
 * @author Frank Ng
 *
 */

public class AmanitaPhalloides extends Mushroom {
	
	public AmanitaPhalloides() {//constructor
		super("green");
	}
	
	@Override
	public boolean isEdible() {//function tell is edible or not
		return false;
	}
	
	public static void testAmanitaPhalloides() {
		AmanitaPhalloides AP1 = new AmanitaPhalloides();
		
		System.out.println(AP1.getColour() == "green");//test get colour
		System.out.println(AP1.isEdible() == false);//test function isEdible
	}
}