/**
 * 
 * @author Frank Ng
 *
 */

public class Pegasus extends Bird {

	public Pegasus(String name) {//constructor
		super(name, 0);
	}
	
	@Override
	public boolean canFly() {//override to make it can fly
		return true;
	}
	
	@Override
	public int getLegs() {//override to get 4 legs
		return 4;
	}
	
	@Override
	public int getNumOfEggs() {//override because do not lay eggs
		System.out.println("Pegasi do not lay eggs!");
		return 0;
	}
	
	public static void testPegasus() {
		Pegasus pegasus1 = new Pegasus("Ziho");
		
		System.out.println(pegasus1.getName() == "Ziho");//test get name
		System.out.println(pegasus1.getLegs() == 4);//test get legs
		System.out.println(pegasus1.getNumOfEggs() == 0);//test to get the number of eggs
		System.out.println(pegasus1.canFly() == true);//test can fly
	}
}
