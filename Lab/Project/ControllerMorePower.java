/**
 * 
 * @author frank
 *
 */

public class ControllerMorePower extends Controller {

	public ControllerMorePower(ElectricityCompany m) {
		super(m);
	}
	
	public String morePower(String name, String amount) {
		int toInt_amount = Integer.parseInt(amount);
		
			try {
				m.morePower(name, toInt_amount);
				// If no exception, return the successfully added message
				return "Added " + toInt_amount + " to " + name + " successfully!";
			} catch (UnknownConsumerException e) {
				System.out.println(e.getMessage());
				return e.getMessage();// If have exception caught, return the message
			} catch (NotAPowerGeneratorException e) {
				System.out.println(e.getMessage());
				return e.getMessage();// If have exception caught, return the message
			}
	}
}
