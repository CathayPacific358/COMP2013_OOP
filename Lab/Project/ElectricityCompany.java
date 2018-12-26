
/**
 * 
 * @author frank
 *
 */

import java.util.ArrayList;

public class ElectricityCompany {

	private String name;
	private ArrayList<Consumer> consumers;
	private ArrayList<ModelListener> listeners;

	// Constructor
	public ElectricityCompany(String name) {
		this.name = name;
		this.consumers = new ArrayList<Consumer>();
		this.listeners = new ArrayList<ModelListener>();
		
	}
	
	// Add listener
	public void addListener(ModelListener listener) {
		listeners.add(listener);
	}
	
	// To notify changes
	private void notifyListeners() {
		for(ModelListener listener: listeners) {
			listener.update();
		}
	}

	// Routinely setup getter and setter although it is not required
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		notifyListeners();
	}

	// Function to add consumers
	public void addConsumer(Consumer consumer) {
		this.consumers.add(consumer);
		notifyListeners();
	}

	// Function to calculate total consumption
	public int totalConsumption() {
		int totalConsumption = 0;
		for (int i = 0; i < consumers.size(); i++) {
			totalConsumption += consumers.get(i).getPower();
		}
		return totalConsumption;
	}

	// Function to get power
	public int getPower(String name) throws UnknownConsumerException {
		int power = 0;
		int checkMatch = 0;
		int matchIndex = 0;

		// Search for match name
		for (int i = 0; i < consumers.size(); i++) {
			if (consumers.get(i).getName().equals(name)) {
				matchIndex = i;
				checkMatch++;
			}
		}

		// If have matching result, find out his/her power
		if (checkMatch == 1) {
			power = consumers.get(matchIndex).getPower();
		} else {// If not, throw an exception
			throw new UnknownConsumerException("Consumer " + name + " unknown");
		}
		return power;
	}

	// Function to set more power
	public void morePower(String name, int amount) throws UnknownConsumerException, NotAPowerGeneratorException {
		int checkMatch = 0;
		int matchIndex = 0;

		// Search for match name
		for (int i = 0; i < consumers.size(); i++) {
			if (consumers.get(i).getName().equals(name)) {
				matchIndex = i;
				checkMatch++;
			}
		}

		// If have matching result, set more power to him/her
		if (checkMatch == 0) {
			throw new UnknownConsumerException("Consumer " + name + " unknown");
		} else {// If not, throw an exception
			consumers.get(matchIndex).morePower(amount);
		}
		notifyListeners();
	}

	public static void testElectricityCompany() {

		try {
			ElectricityCompany ec1 = new ElectricityCompany("STATE GRID");

			// Add some consumers
			ec1.addConsumer(new House("Rory", 2000));
			ec1.addConsumer(new SolarHouse("Jefferson", 2000));
			ec1.addConsumer(new PowerPlant("Weifeng", 1000));

			// Test totalConsumption
			System.out.println(ec1.totalConsumption() == 3000);

			// Test getPower
			System.out.println(ec1.getPower("Jefferson") == 2000);

			// Test morePower
			ec1.morePower("Rory", 500);
			System.out.println(ec1.consumers.get(0).getPower() == 2500);

			// Test Exceptions
			ec1.getPower("Frank");
			ec1.morePower("Frank", 1000);

		} catch (UnknownConsumerException e) {
			System.out.println(e.getMessage().equals("Consumer Frank unknown"));// Catch exception
		} catch (NotAPowerGeneratorException e) {

		}
	}
}
