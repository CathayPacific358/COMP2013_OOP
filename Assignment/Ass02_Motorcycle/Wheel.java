
public class Wheel {

	private boolean flat;
	
	public Wheel() {//constructor
		this.flat = false;
	}
	
	public boolean isFlat() {//function tell the wheel is flat or not
		return flat;
	}
	
	public void setFlat() {//function to set the wheel to flat
		this.flat = true;
	}
	
	public static void testWheel() {
		Wheel originWheel = new Wheel();//object for test
		
		System.out.println(originWheel.isFlat() == false);//test originally the wheel is not flat
		originWheel.setFlat();//set the wheel to flat
		System.out.println(originWheel.isFlat() == true);//test the wheel is flat or not
	}
}
