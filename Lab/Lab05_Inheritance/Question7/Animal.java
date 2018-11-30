/**
 * 
 * @author Frank Ng
 *
 */

public class Animal extends LivingThing{
	
	private double weight;
	
	public Animal(String name, double weight) {
		super(name);//inherit from LivingThing
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public static void testAnimal() {
		Animal animal1 = new Animal("ECWU", 2.0);
		Student stu2 = new Student("Wildman", animal1);
		
		System.out.println(animal1.getName() == "ECWU");//test animal's getName()
		System.out.println(animal1.getWeight() == 2.0);//test animal's getWeight()
		animal1.setWeight(3.0);//set weight
		System.out.println(animal1.getWeight() == 3.0);//test animal's getWeight()
		System.out.println(stu2.getName() == "Wildman");//test student's getName()
		System.out.println(stu2.getPet() == animal1);//test student's getPet()
	}
}
