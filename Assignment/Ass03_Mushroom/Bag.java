/**
 * 
 * @author Frank Ng
 *
 */

public class Bag {
	
	private Mushroom mushroom;
	
	public Bag(Mushroom mushroom) {//constructor
		this.mushroom = mushroom;
	}
	
	public Mushroom getMushroom() {//function to get mushroom
		return mushroom;
	}
	
	public static void testBag() {
		BoletusRubroflammeus br1 = new BoletusRubroflammeus();
		Bag bag1 = new Bag(br1);
		
		System.out.println(bag1.getMushroom() == br1);//test get mushroom
		
		Mushroom br2 = bag1.getMushroom();//assign the br1 of bag1 to br2
		
		System.out.println(br1 == br2);//test whether br are the same
	}
}
