/**
 * 
 * @author Frank Ng
 *
 */

public class Student {

	private String name;
	private Animal pet;
	
	public Student(String name, Animal pet) {//constructor
		this.name = name;
		this.pet = pet;
	}
	
	public String getName() {//to get the name of student
		return name;
	}
	
	public Animal getPet() {//to get the object name of the pet
		return pet;
	}
	
	public static void testStudent() {
		Cat cat1 = new Cat("Tom", 1.0);
		Student stu1 = new Student("Frank", cat1);
		
		System.out.println(stu1.getPet() == cat1);//test getPet()
		System.out.println(stu1.getName() == "Frank");//test getName()
	}
}
