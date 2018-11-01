/**
 * 
 * @author Frank Ng
 *
 */

public class Person implements Parentable {

	private String name;
	private Parentable parent;
	
	public Person(String name, Parentable parent) {//constructor
		this.name = name;
		this.parent = parent;
	}
	
	@Override
	public String getName() {//function get name
		return name;
	}
	
	@Override
	public Parentable getParent() {//function get parent
		return parent;
	}

	public static void testPerson() {
		Ghost g2 = new Ghost("Whooo");
		Person p1 = new Person("ECWU", g2);
		Person p2 = new Person("Elliot", p1);
		
		/* Test for person 1 whose parent is ghost */
		System.out.println(p1.getName() == "ECWU");
		System.out.println(p1.getParent() == g2);
		
		/* Test for person 2 whose parent is person */
		System.out.println(p2.getName() == "Elliot");
		System.out.println(p2.getParent() == p1);
	}
}
