/**
 * 
 * @author frank
 *
 */

public class ControllerCreate extends Controller {

	public ControllerCreate(ElectricityCompany m) {
		super(m);
	}

	public String create(String name, String amount, int type) {
		int toInt_amount = Integer.parseInt(amount);
		String successMes = "";

		switch (type) {
		// For 0, create a house
		case 0: {
			try {
				m.addConsumer(new House(name, toInt_amount));// Create house
				successMes = "Successfully created " + name + "'s House with " + toInt_amount + " watts consumption";
				return successMes;// If created, return message
			} catch (NotAPowerGeneratorException e) {
				return e.getMessage();// If have exception caught, return the message
			}
		}
		// For 1, create a power plant
		case 1: {
			m.addConsumer(new PowerPlant(name, toInt_amount));// Create power plant
			successMes = "Successfully created " + name + "'s Power Plant with " + -toInt_amount + " watts consumption";
			return successMes;// If created, return message
		}
		// For 2, create a solar house
		case 2: {
			try {
				m.addConsumer(new SolarHouse(name, toInt_amount));// Create solar house
				successMes = "Successfully created " + name + "'s Solar House with " + toInt_amount + " watts consumption";
				return successMes;// If created, return message
			} catch (NotAPowerGeneratorException e) {
				return e.getMessage();// If have exception caught, return the message
			}
		}
		default: {
			return "";
		}
		}
	}
}
