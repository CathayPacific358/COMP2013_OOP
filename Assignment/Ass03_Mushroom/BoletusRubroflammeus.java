/**
 * 
 * @author Frank Ng
 *
 */

public class BoletusRubroflammeus extends Boletus{

	public BoletusRubroflammeus() {//constructor
		super("red", 0);
	}
	
	@Override
	public boolean isEdible() {//function tell isEdible
		return false;
	}
	
	public static void testBoletusRubroflammeus() {
		BoletusRubroflammeus BR1 = new BoletusRubroflammeus();
		
		System.out.println(BR1.getColour() == "red");//test get colour
		System.out.println(BR1.getPrice() == 0);//test get price
		System.out.println(BR1.isEdible() == false);//test function isEdible
	}
}
