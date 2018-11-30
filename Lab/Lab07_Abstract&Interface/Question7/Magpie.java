/**
 * 
 * @author Frank Ng
 *
 */

public class Magpie extends Bird{

	public Magpie(String name) {//constructor
		super(name, 6);
	}
	
	@Override
	public boolean canFly() {//override to make it can fly
		return true;
	}

	public static void testMagpie() {
		Magpie magpie1 = new Magpie("ECWU");
		
		System.out.println(magpie1.getName() == "ECWU");//test get name
		System.out.println(magpie1.getLegs() == 2);//test get legs
		System.out.println(magpie1.getNumOfEggs() == 6);//test to get the number of eggs
		System.out.println(magpie1.canFly() == true);//test can fly
	}
}
