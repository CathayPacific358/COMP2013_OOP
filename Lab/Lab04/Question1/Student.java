
public class Student {

	private int ID;
	private boolean sleeping;
	
	public Student(int ID) {//constructor
		this.ID = ID;
		this.sleeping = false;
	}
	
	public int getID() {//function to get ID
		return ID;
	}
	
	public boolean isSleeping() {//function to check is sleeping or not
		return sleeping;
	}
	
	public void fallAsleep() {//function to let fall asleep
		this.sleeping = true;
	}
	
	public void wakeUp() {//function to wake student up
		this.sleeping = false;
	}
	
	public static void testStudent() {//method to test relative functions
		Student s = new Student(1234567890);
		
		System.out.println(s.getID() == 1234567890);
		System.out.println(s.isSleeping() == false);
		s.fallAsleep();
		System.out.println(s.isSleeping() == true);
		s.fallAsleep();//should do nothing because the student is already sleeping
		System.out.println(s.isSleeping() == true);
		s.wakeUp();
		System.out.println(s.isSleeping() == false);
		s.wakeUp();//should do nothing because the student is already awake
		System.out.println(s.isSleeping() == false);
	}
	
}
