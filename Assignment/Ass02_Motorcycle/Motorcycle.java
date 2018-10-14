
public class Motorcycle {

	private Wheel frontWheel;
	private Wheel backWheel;
	private String colour;
	private int gasoline;
	
	public Motorcycle(String colour, int gasoline) {//constructor
		this.colour =  colour;
		this.gasoline = gasoline;
		this.frontWheel = new Wheel();
		this.backWheel = new Wheel();
	}
	
	public String getColour() {//check the colour of the motorcycle
		return colour;
	}
	
	public int getGasoline() {//check how many liters of gasoline the motorcycle have
		return gasoline;
	}
	
	public boolean addGasoline(int gasoline) {//add gasoline
		if(gasoline > 0) {//when input value is positive, add gasoline
			this.gasoline += gasoline;
			return true;
		}else {//when it is not, do not add gasoline
			return false;
		}
	}
	
	public void drive() {//function to drive and consume gasoline
		if(this.gasoline >= 2) {//if having no enough gasoline, cannot drive
			this.gasoline -= 2;
		}
	}
	
	public void accident() {//to trigger an accident
		this.frontWheel.setFlat();
	}
	
	public void repair() {//repair the wheel
		this.frontWheel = new Wheel();
	}
	
	public int getMaxSpeed() {//function to check the max speed
		if(gasoline == 0) {
			return 0;
		}else if(frontWheel.isFlat() == false && backWheel.isFlat() == false) {
			return 100;
		}else {
			return 10;
		}
	}
	
	public static void testMotorcycle() {
		Motorcycle originMotor = new Motorcycle("Red", 100);//object for following test
		
		System.out.println(originMotor.getColour() == "Red");//check colour
		System.out.println(originMotor.getGasoline() == 100);//check gasoline
		originMotor.addGasoline(10);//add gasoline to the motorcycle
		System.out.println(originMotor.getGasoline() == 110);//check gasoline after added
		originMotor.drive();//let drive
		System.out.println(originMotor.getGasoline() == 108);//check after driven
		originMotor.accident();//trigger accident
		System.out.println(originMotor.getMaxSpeed() == 10);//check max speed after the accident
		originMotor.repair();//repair the motorcycle
		System.out.println(originMotor.getMaxSpeed() == 100);//check max speed when is repaired
	}
	
}
