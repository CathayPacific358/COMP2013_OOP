/**
 * 
 * @author Frank Ng
 *
 */

public class Student extends LivingThing{

	private Animal pet;
	
	public Student(String name, Animal pet) {//constructor
		super(name);//inherit from LivingThing
		this.pet = pet;
	}
	
	public Animal getPet() {//to get the object name of the pet
		return pet;
	}
	
	public static void testStudent() {
		Cat cat1 = new Cat("Tom", 1.0);
		Student stu1 = new Student("Frank", cat1);
		
		System.out.println(stu1.getPet() == cat1);//test getPet()
		System.out.println(stu1.getName() == "Frank");//test getName()
		
		/*Test use bird as pet */
		Bird bird1 = new Bird("Pharah", 1.0, 100.0);
		Student stu2 = new Student("Lennox", bird1);
		System.out.println(stu2.getPet() == bird1);
	}
}
