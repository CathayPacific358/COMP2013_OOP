/**
 * 
 * @author Frank Ng
 *
 */

public class Door {

	private boolean isOpen;
	
	public Door() {//constructor
		this.isOpen = false;//door is closed when created
	}
	
	public boolean isOpen() {//function isOpen to tell the door is open or not
		return isOpen;
	}
	
	public void open() {//function open to open the door
		this.isOpen = true;
	}
	
	public void close() {//function close to close the door
		this.isOpen = false;
	}
	
	public static void testDoor() {
		Door d1 = new Door();
		
		System.out.println(d1.isOpen() == false);//test isOpen
		d1.open();//test open
		System.out.println(d1.isOpen() == true);
		d1.close();//test close
		System.out.println(d1.isOpen() == false);
	}
}
