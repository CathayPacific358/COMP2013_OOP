/**
 * 
 * @author Frank Ng
 *
 */

public class Ghost implements Parentable {

	private String name;
	
	public Ghost(String name) {//constructor
		this.name = name;
	}
	
	@Override
	public String getName() {//function get name
		return name;
	}
	
	@Override
	public Parentable getParent() {//function get parent
		return Ghost.this;
	}
	
	public static void testGhost() {
		Ghost g = new Ghost("Whoooo");
		System.out.println(g.getName() == "Whoooo");
		// The parent of the ghost is the ghost himself
		System.out.println(g.getParent() == g);
	}
}
