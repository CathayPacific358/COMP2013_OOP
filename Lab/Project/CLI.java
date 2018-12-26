
/**
 * 
 * @author frank
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {

	private static Scanner input = new Scanner(System.in);

	// Function to read line
	private static String readLine(String notice) {
		System.out.print(notice);// Print the tip message
		String input = CLI.input.nextLine();// Read the input
		return input; // Return input as String
	}

	// Function to read positive integer
	private static int readPosInt(String notice) {
		while (true) { // Always looping until returned something
			System.out.print(notice);// Print the tip message
			try {
				int isInt = CLI.input.nextInt();// Read the input
				input.nextLine();// Read one line, discard %n
				if (isInt < 0) {// If the integer is negative
					System.out.println("Positive integers only!");
				} else {
					return isInt;// If it is a valid integer, return the value
				}
			} catch (InputMismatchException e) {// If the input is not integer
				System.out.println("You must type an integer!");
				input.nextLine();// Read one line, discard %n
			}
		}
	}

	public static void main(String[] args) {
		ElectricityCompany UE = new ElectricityCompany("UIC Electrtic");
		while (true) {
			int menu = readPosInt("Type an action (total:1 add:2 get:3 more:4 less:5 quit:6): ");// Print out the menu
			
			// Use switch to differentiate 6 action
			switch(menu) {
			// Action 1 to show the total consumption of the EC
			case 1:{
				System.out.println("Total amount of power consumed: " + UE.totalConsumption());
			}
			break;
			
			// Action 2 to add consumer
			case 2:{
				int secMenu = readPosInt("Type the consumer type (power plant:1 house:2 solar house:3): ");
				switch(secMenu) {
				// Select 1 to add power plant
				case 1:{
					String name = readLine("Enter the name of the consumer: ");// Ask to enter name
					int power = readPosInt("Enter the initial amount of power: ");// Ask to enter power
					UE.addConsumer(new PowerPlant(name, power));// Add anonymous object
					System.out.println("Power plant \"" + name + "\" generating " + power + " watts of power added");// Print the tip
				}
				break;
				// Select 2 to add house
				case 2:{
					String name = readLine("Enter the name of the consumer: ");// Ask to enter name
					int power = readPosInt("Enter the initial amount of power: ");// Ask to enter power
					try {
						UE.addConsumer(new House(name, power));// Add anonymous object
					} catch (NotAPowerGeneratorException e) {// Catch NotAPowerGeneratorEcetion
						System.out.println("BUG! This must never happen!");
						System.exit(1);// If happens, directly shut down the programme
					}
					System.out.println("House of \"" + name + "\" consuming " + power + " watts of power added");// Print the tip
				}
				break;
				// Select 3 to add solar house
				case 3:{
					String name = readLine("Enter the name of the consumer: ");// Ask to enter name
					int power = readPosInt("Enter the initial amount of power: ");// Ask to enter power
					try {
						UE.addConsumer(new SolarHouse(name, power));// Add anonymous object
					} catch (NotAPowerGeneratorException e) {
						System.out.println("BUG! This must never happen!");
						System.exit(1);// If happens, directly shut down the programme
					}
					System.out.println("Solar house of \"" + name + "\" consuming " + power + " watts of power added");// Print the tip
				}
				break;
				default:
					System.out.println("Unknown type of consumer!");// If input is something else except 1-6, print tip
				}
			}
			break;
			
			// Action 3 to list the amount of power consumed by a given consumer
			case 3:{
				String name = readLine("Enter the name of the consumer: ");// Ask to enter name
				try {
					System.out.println(name + " uses " + UE.getPower(name) + " watts");// Call function getPower() and print the tip
				} catch (UnknownConsumerException e) {
					System.out.println(e.getMessage());// If triggered exception, print the exception message
				}
			}
			break;
			
			// Action 4 to increase the power of a given consumer
			case 4:{
				String name = readLine("Enter the name of the consumer: ");// Ask to enter name
				int power = readPosInt("Enter the amount of power: ");// Ask to enter power
				try {
					UE.morePower(name, power);// Call function morePower()
				}catch(UnknownConsumerException e) {
					System.out.println(e.getMessage());// If triggered exception, print the exception message
				}catch(NotAPowerGeneratorException e) {
					System.out.println(e.getMessage());// If triggered exception, print the exception message
				}
			}
			break;
			
			// Action 5 to decrease the power of a given consumer
			case 5:{
				String name = readLine("Enter the name of the consumer: ");// Ask to enter name
				int power = -readPosInt("Enter the amount of power: ");// Ask to enter power and add negative sign to decrease power
				try {
					UE.morePower(name, power);// Call function morePower()
				}catch(UnknownConsumerException e) {
					System.out.println(e.getMessage());// If triggered exception, print the exception message
				}catch(NotAPowerGeneratorException e) {
					System.out.println(e.getMessage());// If triggered exception, print the exception message
				}
			}
			break;
			
			// Action 6 to quit the programme
			case 6:{
				System.out.println("Goodbye!");// Au revoir
				UE.saveData();// Save data before terminating the programme
				System.exit(0);// Exit the programme
			}
			break;
			
			// Input is other number except 1-6
			default:
				System.out.println("Unknown action!");// Print the tip
			}
		}
	}
}
