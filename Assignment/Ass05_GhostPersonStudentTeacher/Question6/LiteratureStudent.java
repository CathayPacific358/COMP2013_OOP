/**
 * 
 * @author Frank Ng
 *
 */

public class LiteratureStudent extends Student {

	public LiteratureStudent(String name) {//constructor
		super(name, 3.98);
	}
	
	@Override
	public boolean canProgramme() {//a literature student cannot programme
		return false;
	}
	
	public static void testLiteratureStudent() {
		LiteratureStudent ls1 = new LiteratureStudent("Ziho");
		
		System.out.println(ls1.getGPA() == 3.98);//test get gpa
		System.out.println(ls1.getName() == "Ziho");//test get name
		System.out.println(ls1.canProgramme() == false);//test can programme
	}
}
