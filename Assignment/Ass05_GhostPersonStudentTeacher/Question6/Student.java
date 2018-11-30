/**
 * 
 * @author Frank Ng
 *
 */

public abstract class Student extends Person {

	private double gpa;
	
	public Student(String name, double gpa) {//constructor
		super(name);
		this.gpa = gpa;
	}
	
	public double getGPA() {//function to get gpa
		return gpa;
	}
	
	public static void testStudent() {
		//leave it blank as it cannot create object
	}
}
