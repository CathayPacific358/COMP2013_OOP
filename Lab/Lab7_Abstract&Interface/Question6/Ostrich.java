/**
 * 
 * @author Frank Ng
 *
 */

public class Ostrich extends Bird {

	public Ostrich(String name) {//constructor
		super(name, 10);
	}
	
	@Override
	public boolean canFly() {//override to make it cannot fly
		return false;
	}
	
	public static void testOstrich() {
		Ostrich ostrich1 = new Ostrich("Elliot");
		
		System.out.println(ostrich1.getName() == "Elliot");//test get name
		System.out.println(ostrich1.getLegs() == 2);//test get legs
		System.out.println(ostrich1.getNumOfEggs() == 10);//test to get the number of eggs
		System.out.println(ostrich1.canFly() == false);//test can fly
	}
}
