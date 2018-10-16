/**
 * 
 * @author Frank Ng
 *
 */

public class Dog {

	private String name;
	private double weight;
	
	public Dog(String name, double weight) {//constructor
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {//to get the name of the dog
		return name;
	}
	
	public double getWeight() {//to get the weight of the dog
		return weight;
	}
	
	public void feed() {//to feed the dog and add 2.0 of the weight
		weight += 2.0;
	}
	
	public static void testDog() {
		Dog d = new Dog("Woof", 2.0);
		
		System.out.println(d.getName() == "Woof");
		System.out.println(d.getWeight() == 2.0);
		d.feed();
		//The name is still the same but the weight increased by 2.0
		System.out.println(d.getName() == "Woof");
		System.out.println(d.getWeight() == 4.0);
	}
}
