/**
 * 
 * @author Frank Ng
 *
 */

public class CoffeeMachine {

	private int numCups, temperature;

	/*This is the constructor that required in the question */
	public CoffeeMachine() {
		this.numCups = 10;
		this.temperature = 70;
	}
	
	/*This is a constructor for TEST only */
	public CoffeeMachine(int temperature, int numCups) {
		this.numCups = numCups;
		this.temperature = temperature;
	}

	public int getTemp() {//function getTemp
		return temperature;
	}

	public void setTemp(int newTemp) {//function setTemp()
		/*Use if to tell whether the input parameter is legal or not */
		if (newTemp < 50 || newTemp > 90) {
			System.out.println("Temperature " + newTemp + " must be between 50 and 90!");
		} else {
			if (newTemp % 10 != 0) {
				System.out.println("Temperature " + newTemp + " must be a multiple of 10!");
			} else {
				this.temperature = newTemp;
			}
		}
	}

	public void getCoffee() {//function getCoffee()
		/*Use if to tell whether the cup number is 0 or not*/
		if (numCups > 0) {
			numCups--;
		} else {
			System.out.println("You cannot get coffee when there are no cups!");
		}
	}

	public void addCups() {//function addCups()
		/*Use if to tell whether the cup number is 0 or not*/
		if (numCups == 0) {
			numCups = 10;
			System.out.println("Successfully added 10 cups!");
		} else {
			System.out.println("Not enough space inside the machine to add 10 new cups!");
		}
	}

	public void cooler() {//function cooler()
		/*Use if to tell whether the temperature is available to -10 or not*/
		if (temperature - 10 > 50) {
			temperature -= 10;
		} else {
			System.out.println("The temperature of the coffee cannot go below 50 degrees!");
		}
	}

	public void hotter() {//function hotter()
		/*Use if to tell whether the temperature is available to +10 or not*/
		if (temperature + 10 < 90) {
			temperature += 10;
		} else {
			System.out.println("The temperature of the coffee cannot go above 90 degrees!");
		}
	}

	
	public static void testCoffeeMachine() {
		
		CoffeeMachine machineOrigin = new CoffeeMachine();
		CoffeeMachine machineHaveCups = new CoffeeMachine();
		CoffeeMachine machineNoCup = new CoffeeMachine(70, 0);//a object that cup number = 0
		CoffeeMachine machineTemp50 = new CoffeeMachine(50, 10);//a object that temperature = 50
		CoffeeMachine machineTemp90 = new CoffeeMachine(90, 10);//a object that temperature = 90
		
		System.out.println(machineOrigin.numCups == 10);//after created cup number would be 10
		System.out.println(machineOrigin.temperature == 70);//after created temperature would be 70
		System.out.println(machineOrigin.getTemp() == 70);//test function getTemp()
		
		machineNoCup.getCoffee();//test function getCoffee() while no cup in the machine
		machineHaveCups.getCoffee();//test function getCoffee() while there are cups in the machine
		System.out.println(machineHaveCups.numCups == 9);//test the result of function getCoffee()
		
		machineNoCup.addCups();//test function addCups() while no cup in the machine
		machineHaveCups.addCups();//test function addCups() while there are cups in the machine
		System.out.println(machineNoCup.numCups == 10);//test the result of function addCups()
		
		machineTemp50.cooler();//test function cooler() when temperature = 50
		machineOrigin.cooler();//test function cooler() when temperature is normal
		System.out.println(machineOrigin.temperature == 60);//test the result of cooler()
		
		machineTemp90.hotter();//test function hotter() when temperature = 90
		machineHaveCups.hotter();//test function hotter() when temperature is normal
		System.out.println(machineHaveCups.temperature == 80);//test the result of hotter()
		
		machineOrigin.setTemp(75);//test function setTemp() when input value % 10 != 0
		machineOrigin.setTemp(90);//set temperature to 90
		machineOrigin.setTemp(40);//set temperature to lower than 50
		machineOrigin.setTemp(100);//set temperature to higher than 90
		System.out.println(machineOrigin.temperature == 90);//test the result of setTemp()
		
		
		
		

	}
}
