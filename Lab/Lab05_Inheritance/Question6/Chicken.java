/**
 * 
 * @author Frank Ng
 *
 */

public class Chicken extends Bird{

	public Chicken(String name) {
		super(name, 5.0, 0.0);
	}
	
	public static void testChicken() {
		Chicken chicken1 = new Chicken("alienware");
		
		System.out.println(chicken1.getAltitude() == 0.0);//test get altitude
		System.out.println(chicken1.getName() == "alienware");//test get name
		System.out.println(chicken1.getWeight() == 5.0);//test get weight
	}
}
