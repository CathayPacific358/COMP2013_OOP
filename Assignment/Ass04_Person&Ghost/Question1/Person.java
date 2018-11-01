/**
 * 
 * @author Frank Ng
 *
 */

public class Person {

	private String name;
	private Person parent;
	
	public Person(String name, Person parent) {//constructor
		this.name = name;
	}
	
	public String getName() {//function get name
		return name;
	}
	
	public Person getParent() {//function get parent
		return parent;
	}
	
	public static void testPerson() {
		//leave it empty as it cannot create object
	}
}
