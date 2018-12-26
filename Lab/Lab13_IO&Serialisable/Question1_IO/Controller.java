/**
 * 
 * @author Frank Ng
 *
 */

public class Controller {

	protected Model m;
	
	public Controller(Model m) {
		this.m = m;
	}
	
	// Function to shutdown and save data
	protected void shutdown() {
		m.saveData();
		System.exit(0);
	}
}
