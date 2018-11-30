/**
 * 
 * @author Frank Ng
 *
 */

public class Teacher extends Person{

	public Teacher(String name) {//constructor
		super(name);
	}
	
	@Override
	public boolean canProgramme() {//function to check can programme or not
		return true;
	}
	
	public static void testTeacher() {
		Teacher t1 = new Teacher("ECWU");
		
		System.out.println(t1.getName() == "ECWU");//test get name
		System.out.println(t1.canProgramme() == true);//test can programme or not
	}
}
