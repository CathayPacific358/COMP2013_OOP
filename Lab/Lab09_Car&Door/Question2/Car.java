/**
 * 
 * @author Frank Ng
 *
 */

public class Car {

	private String name;
	private Door[] doors;

	public Car(String name, int numberOfDoors) throws BadCarException {// constructor
		if (numberOfDoors < 1) {// a car should have at least one door
			throw new BadCarException("A car must have at least one door!");
		} else {
			this.name = name;
			this.doors = new Door[numberOfDoors];// create array
			for (int i = 0; i < doors.length; i++) {// use loop to create doors
				doors[i] = new Door();
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
		if (doorNumber < 1 || doorNumber > doors.length) {
			throw new BadDoorException("Door " + doorNumber + " does not exist!");
		} else {
			doors[doorNumber - 1].open();
		}
	}
	
	public void changeAllDoors() {
		for(int i = 0; i < doors.length; i++) {//for each door
			if(doors[i].isOpen()) {//if the door is open
				doors[i].close();//set it to close
			}else {//if the door is close
				doors[i].open();//set it to open
			}
		}
	}

	public static void testCar() {

		try {
			Car carNoDoor = new Car("Cool", 0);//test BadCarException
		} catch (BadCarException e) {
			System.out.println(e.getMessage() == "A car must have at least one door!");//test BadCarException
		}

		try {
			/* Test from Question 1 */
			Car carNormal = new Car("TeslaModelX", 4);// a Tesla have 4 doors
			carNormal.listDoors();// test list door
			System.out.println(carNormal.countOpenDoors());// test count open doors
			carNormal.openOneDoor(1);// open door 1
			carNormal.listDoors();// list door after open door 1
			System.out.println(carNormal.countOpenDoors());// count open doors again
	
			/* Test from Question 2 */
			carNormal.changeAllDoors();
			carNormal.listDoors();
			
			/* Test exceptions */
			carNormal.openOneDoor(5);// test BadDoorException
			
		} catch (BadCarException e) {
			System.out.println(e.getMessage());
		} catch (BadDoorException e) {
			System.out.println(e.getMessage().equals("Door 5 does not exist!"));// test BadDoorException
		}
	}

}
