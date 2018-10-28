/**
 * 
 * @author Frank Ng
 *
 */

public class Boletus extends Mushroom {

	private int price;
	
	public Boletus(String colour, int price) {//constructor
		super(colour);
		this.price = price;
	}
	
	public int getPrice() {//function to get price
		return price;
	}
	
	@Override
	public boolean isEdible() {//override function isEdible
		return true;
	}
	
	public static void testBoletus() {
		Boletus boletus1 = new Boletus("white", 100);
		
		System.out.println(boletus1.getColour() == "white");//test get colour
		System.out.println(boletus1.getPrice() == 100);//test get price
		System.out.println(boletus1.isEdible() == true);//test function isEdible
	}
}
