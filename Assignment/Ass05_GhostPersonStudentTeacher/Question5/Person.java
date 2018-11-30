/**
 * 
 * @author Frank Ng
 *
 */

public abstract class Person implements Named{

	private String name;
	
	public Person(String name) {//constructor
		this.name = name;
	}
	
	public String getName() {//function to get name
		return name;
	}
	
	public abstract boolean canProgramme();//leave it abstract as do not know whether can or not
	
	public static void testPerson() {
		//leave it blank as it cannot new a object
	}
}
