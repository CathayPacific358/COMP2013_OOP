/**
 * 
 * @author frank
 *
 */

public class SolarHouse extends House {

	public SolarHouse(String owner, int power) throws NotAPowerGeneratorException {// Constructor
		super(owner, power);
	}

	@Override
	public void morePower(int amount) {// Override because SolarHouse no needs to throw exception
		this.setPower(this.getPower() + amount);
	}

	public static void testSolarHouse() {
		try {
			SolarHouse sh1 = new SolarHouse("ECWU", 200);

			System.out.println(sh1.getName() == "ECWU");// The owner of the solar house is ECWU
			System.out.println(sh1.getPower() == 200);// The power of the solar house is set to 200
			sh1.morePower(-1200);// To set -1200 more power
			System.out.println(sh1.getPower() == -1000);// The power of the solar house is set to -1000
		} catch (NotAPowerGeneratorException e) {
			// No need to catch any exception
		}
	}
}
