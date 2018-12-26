
/**
 * 
 * @author frank
 *
 */

import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ElectricityCompany implements Serializable {

	private String name;
	private ArrayList<Consumer> consumers;
	private ArrayList<ModelListener> listeners;
	private ArrayList<Integer> history;
	private File file;

	// Constructor
	public ElectricityCompany(String name) {
		this.name = name;
		this.consumers = new ArrayList<Consumer>();
		this.listeners = new ArrayList<ModelListener>();
		this.history = new ArrayList<Integer>();
		file = new File("UIC Electirc.bin");
		
		if(file.exists()) {
			try {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				consumers = (ArrayList<Consumer>) ois.readObject();// Load the object data from the file
				history = (ArrayList<Integer>) ois.readObject();// Load the object data from the file
				
				ois.close();
				fis.close();
			}catch(IOException e) {
				System.err.println(e.getMessage());
				System.exit(1);
			}catch(ClassNotFoundException e) {
				System.err.println(e.getMessage());
				System.exit(1);
			}
		}
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
		history.add(this.totalConsumption());
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
		history.add(this.totalConsumption());
		notifyListeners();
	}

	// Function to get history
	public ArrayList<Integer> getHistory() {
		return history;
	}
	
	// Function to save data
	public void saveData() {
		try {
			FileOutputStream fo = new FileOutputStream("UIC Electirc.bin");
			ObjectOutputStream out = new ObjectOutputStream(fo);
			out.writeObject(consumers);// Print the object data in the file
			out.writeObject(history);// Print the object data in the file
			
			out.close();
			fo.close();
		}catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}catch(IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
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
