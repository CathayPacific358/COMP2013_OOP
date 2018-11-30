/**
 * 
 * @author Frank Ng
 *
 */
import java.util.ArrayList;

public class Car {

	private String name;
	ArrayList<Door> doors;//declare a arraylist variable of Class Door

	public Car(String name, int numberOfDoors) throws BadCarException {// constructor
		if (numberOfDoors < 1) {// a car should have at least one door
			throw new BadCarException("A car must have at least one door!");
		} else {
			this.name = name;
			doors = new ArrayList<Door>();//create arraylist object of Class Door
			
			for (int i = 0; i < numberOfDoors; i++) {// use loop to create doors
				doors.add(new Door());
			}
		}
	}

	public void listDoors() {// function to list doors

		for (Door d : doors) {// use enhanced for loop to list
			if (d.isOpen()) {
				System.out.println(this.name + ": door is open");
			} else {
				System.out.println(this.name + ": door is closed");
			}
		}
	}

	public int countOpenDoors() {
		int i = 0;
		for (Door d : doors) {// use enhanced for loop to list
			if (d.isOpen()) {
				i++;
			}
		}

		return i;
	}

	public void openOneDoor(int doorNumber) throws BadDoorException {// door number starts from 1
		if (doorNumber < 1 || doorNumber > doors.size()) {
			throw new BadDoorException("Door " + doorNumber + " does not exist!");
		} else {
			doors.get(doorNumber - 1).open();
		}
	}

	public void changeAllDoors() {
		for (int i = 0; i < doors.size(); i++) {// for each door
			if (doors.get(i).isOpen()) {// if the door is open
				doors.get(i).close();// set it to close
			} else {// if the door is close
				doors.get(i).open();// set it to open
			}
		}
	}

	public void replaceDoor(int doorNumber) throws BadDoorException {
		if (doorNumber < 1 || doorNumber > doors.size()) {//door number starts from 1
			throw new BadDoorException("Door " + doorNumber + " does not exist!");
		} else {
			doors.set(doorNumber - 1, new Door());//replace it with a new door
		}
	}
	
	public void replaceAllDoors() {
		for(int i = 0; i < doors.size(); i++) {//replace one by one
			doors.set(i, new Door());
		}
	}
	
	public void replaceManyDoors(int numOfDoorsToReplace) {
		for(int i = 0; i < numOfDoorsToReplace; i++) {
			doors.set(i, new Door());
		}
	}
	
	public void expandCar() {
		for(int i = 0; i < 2; i++) {
			doors.add(new Door());
		}
	}

	public static void testCar() {

		try {
			Car carNoDoor = new Car("Cool", 0);// test BadCarException
		} catch (BadCarException e) {
			System.out.println(e.getMessage() == "A car must have at least one door!");// test BadCarException
		}

		try {
			/* Test from Question 1 */
			Car carNormal = new Car("TeslaModelX", 4);// a Tesla have 4 doors
			carNormal.listDoors();// test list door
			System.out.println(carNormal.countOpenDoors() == 0);// test count open doors
			carNormal.openOneDoor(1);// open door 1
			carNormal.listDoors();// list door after open door 1
			System.out.println(carNormal.countOpenDoors() == 1);// count open doors again
			System.out.println("--");
			
			/* Test from Question 2 */
			carNormal.changeAllDoors();
			carNormal.listDoors();
			System.out.println("--");
			
			/* Test from Question 3 */
			carNormal.replaceDoor(2);//as what is shown that door 2 is closed, which means it is a new door
			carNormal.listDoors();
			System.out.println("--");
			
			/* Test from Question 4 */
			carNormal.replaceAllDoors();
			carNormal.listDoors();//all doors are closed, which means all doors are replaced
			System.out.println("--");
			
			/* Test from Question 5 */
			carNormal.changeAllDoors();//open all firstly
			carNormal.listDoors();
			carNormal.replaceManyDoors(3);//3 doors are closed, which means all doors are replaced
			carNormal.listDoors();
			System.out.println("--");
			
			/* Test from Question 6 */
			carNormal.expandCar();	
			carNormal.listDoors();
			System.out.println("--");
			
			/* Test exceptions */
			carNormal.openOneDoor(5); //test BadDoorException
			carNormal.replaceDoor(5);//test BadDoorException
			//carNormal.replaceManyDoors(5);//a Tesla have 4 doors only


		} catch (BadCarException e) {
			System.out.println(e.getMxessage());
		} catch (BadDoorException e) {
			System.out.println(e.getMessage().equals("Door 5 does not exist!"));// test BadDoorException
		} catch(IndexOutOfBoundsException e) {

		}
	}

}
