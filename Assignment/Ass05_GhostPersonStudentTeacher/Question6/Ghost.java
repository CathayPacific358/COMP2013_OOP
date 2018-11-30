/**
 * 
 * @author Frank Ng
 *
 */

public class Ghost implements Named{

	public Ghost() {//constructor
	
	}
	
	public String getName() throws NoNameException {//throw an exception
		throw new NoNameException("A ghost has no name!");
	}
	
	public static void testGhost() {
		Ghost g1 = new Ghost();
		
		try {
			g1.getName();//try get name
		}catch(NoNameException e) {//catch the NoNameException
			System.out.println(e.getMessage() == "A ghost has no name!");
		}
	}
}
