/**
 * 
 * @author Frank Ng
 *
 */

public class GUI {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ElectricityCompany m = new ElectricityCompany("UIC Electirc");
				try {
					House h = new House("ECWU", 2000);
					PowerPlant pp = new PowerPlant("Frank", 1500);
					m.addConsumer(pp);
					m.addConsumer(h);
				} catch (NotAPowerGeneratorException e) {
					e.getMessage();
				}
				
				// Add all changes before this line
				ControllerSimple c_smp = new ControllerSimple(m);
				ControllerGetPower c_getPower = new ControllerGetPower(m);
				ControllerMorePower c_morePower = new ControllerMorePower(m);
				ControllerCreate c_create = new ControllerCreate(m);
				ViewSimple v_smp = new ViewSimple(m, c_smp);
				ViewGetPower v_getPower = new ViewGetPower(m, c_getPower);
				ViewMorePower v_morePower = new ViewMorePower(m, c_morePower);
				ViewCreate v_create = new ViewCreate(m, c_create);
			}
		});
	}
}
