/**
 * 
 * @author Frank Ng
 *
 */

public abstract class Bird extends Animal implements Flyer{

	private int numOfEggs;
	
	public Bird(String name, int numOfEggs) {//constructor
		super(name);
		this.numOfEggs = numOfEggs;
	}
	
	@Override
	public int getLegs() {//override to have 2 legs
		return 2;
	}
	
	public int getNumOfEggs() {//function to get number of eggs
		return numOfEggs;
	}
	
	@Override
	public abstract boolean canFly();
	
	public static void testBird() {
		//leave it blank as it is abstract
	}
}
