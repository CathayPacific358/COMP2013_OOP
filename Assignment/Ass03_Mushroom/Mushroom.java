/**
 * 
 * @author Frank Ng
 *
 */

public class Mushroom {
	
	private String  colour;
	
	public Mushroom(String colour) {
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}
	
	public boolean isEdible() {
		System.out.println("Do not eat this!");
		return false;
	}
	
	public static void testMushroom() {
		
	}
}
