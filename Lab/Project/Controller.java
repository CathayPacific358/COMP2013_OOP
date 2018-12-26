/**
 * 
 * @author Frank Ng
 *
 */

public class Controller {

	protected ElectricityCompany m;
	
	public Controller(ElectricityCompany m) {
		this.m = m;
	}
	
	// Function to shutdown the programme
	public void shutdown() {
		m.saveData();
		System.exit(0);
	}
}
