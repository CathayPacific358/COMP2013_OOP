/**
 * 
 * @author frank
 *
 */

public class ControllerGetPower extends Controller {

	public ControllerGetPower(ElectricityCompany m) {
		super(m);
	}
	
	// getPower and return in string
	public String getPower(String name) {
		String toStr = "";
		try {
			toStr = String.valueOf(m.getPower(name));
			return toStr;// If no exception, return the value in string
		}catch(UnknownConsumerException e) {
			System.out.println(e.getMessage());
			return e.getMessage();// If have exception caught, return the message
		}
	}
}
