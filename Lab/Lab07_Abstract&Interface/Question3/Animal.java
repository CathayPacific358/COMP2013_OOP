/**
 * 
 * @author Frank Ng
 *
 */

public abstract class Animal {

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract int getLegs();
	
	public abstract boolean canFly();
	
	public static void testAnimal() {
		//leave it blank as it is abstract
	}
}
