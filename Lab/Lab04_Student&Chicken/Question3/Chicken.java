
public class Chicken {

	private double weight;
	private boolean sleeping;
	
	public Chicken(double weight) {//constructor
		this.sleeping = true;
		this.weight = weight;
	}
	
	public double getWeight() {//function to get weight
		return this.weight;
	}
	
	public boolean isSleeping() {//function to check is sleeping or not
		return this.sleeping;
	}
	
	public void fallAsleep() {//function to let fall asleep
		this.sleeping = true;
	}
	
	public void wakeUp() {//function to wake it up
		this.sleeping = false;
	}
	
	public static void testChicken() {//method to test relative functions
		Chicken c = new Chicken(2.3);
		
		System.out.println(c.getWeight() == 2.3);
		System.out.println(c.isSleeping() == true);
		c.wakeUp();
		System.out.println(c.isSleeping() == false);
		c.wakeUp();//should do nothing because the chicken is already awake
		System.out.println(c.isSleeping() == false);
		c.fallAsleep();
		System.out.println(c.isSleeping() == true);
	}
}
