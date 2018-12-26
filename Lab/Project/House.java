import java.io.Serializable;

/**
 * 
 * @author frank
 *
 */

public class House extends Building {

	public House(String owner, int power) throws NotAPowerGeneratorException {// Constructor
		super(owner, power);
		if (power < 0) {// A house can not generate power
			throw new NotAPowerGeneratorException("A new house cannot generate power");
		}
	}

	@Override
	public void morePower(int amount) throws NotAPowerGeneratorException {// Override function more power
		if (this.getPower() + amount < 0) {// A house can not generate power
			throw new NotAPowerGeneratorException("A house cannot generate " + -(this.getPower() + amount) + " watts of power");
		} else {
			this.setPower(this.getPower() + amount);
		}
	}

	public static void testHouse() {

		try {
			House h1 = new House("Frank", 1000);

			System.out.println(h1.getName() == "Frank");// The owner called Frank
			System.out.println(h1.getPower() == 1000);// House is set to consume 1000 watts of power
			h1.morePower(1000);// To consume 1000 more power
			System.out.println(h1.getPower() == 2000);// House is set to consume 2000 watts of power
			h1.morePower(-2200);// To consume -2200 more power
		} catch (NotAPowerGeneratorException e) {
			// Trigger exception because 2000-2200 = -200 and a house can not generate power
			System.out.println(e.getMessage().equals("A house cannot generate 200 watts of power"));
		}
	}

}
