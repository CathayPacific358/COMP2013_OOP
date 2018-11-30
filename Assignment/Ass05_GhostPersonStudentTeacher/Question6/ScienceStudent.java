/**
 * 
 * @author Frank Ng
 *
 */

public class ScienceStudent extends Student {

	public ScienceStudent(String name) {//constructor
		super(name, 4.0);
	}
	
	@Override
	public boolean canProgramme() {//a science student can programme
		return true;
	}
	
	public static void testScienceStudent() {
		ScienceStudent ss1 = new ScienceStudent("Frank");
		
		System.out.println(ss1.getGPA() == 4.0);//test get gpa
		System.out.println(ss1.getName() == "Frank");//test get name
		System.out.println(ss1.canProgramme() == true);//test can programme
	}
}
