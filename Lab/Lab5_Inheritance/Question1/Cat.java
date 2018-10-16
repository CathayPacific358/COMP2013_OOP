/**
 * 
 * @author Frank Ng
 *
 */

public class Cat {

	private String name;
	private double weight;
	
	public Cat(String name, double weight) {//constructor
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {//to get the name of the cat
		return name;
	}
	
	public double getWeight() {//to get the weight of the cat
		return weight;
	}
	
	public void feed() {//to feed the cat and add 1.0 of the weight
		weight += 1.0;
	}
	
	public static void testCat() {
		Cat c = new Cat("Meow", 2.0);
		
		System.out.println(c.getName() == "Meow");
		System.out.println(c.getWeight() == 2.0);
		c.feed();
		//The name is still the same but the weight increased by 1.0
		System.out.println(c.getName() == "Meow");
		System.out.println(c.getWeight() == 3.0);
	}
}
