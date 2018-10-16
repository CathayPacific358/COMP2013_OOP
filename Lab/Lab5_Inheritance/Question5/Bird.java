/**
 * 
 * @author Frank Ng
 *
 */

public class Bird extends Animal{

	private double altitude;
	
	public Bird(String name, double weight, double altitude) {
		super(name,weight);
		this.altitude = altitude;	
	}
	
	public double getAltitude() {
		return altitude;
	}
	
	public static void testBird() {
		Bird birdTest = new Bird("Gugu", 1.0, 100.0);
		
		System.out.println(birdTest.getAltitude() == 100.0);//test get altitude
		System.out.println(birdTest.getName() == "Gugu");//test get name
		System.out.println(birdTest.getWeight() == 1.0);//test get weight
		
	}
}
