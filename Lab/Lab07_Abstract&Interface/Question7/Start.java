/**
 * 
 * @author Frank Ng
 *
 */

public class Start {

	public static void main(String[] args) {
		Animal.testAnimal();
		Dog.testDog();
		Bird.testBird();
		Magpie.testMagpie();
		Ostrich.testOstrich();
		Pegasus.testPegasus();
		
		Flyer magpie2 = new Magpie("ECWU");
		Flyer ostrich2 = new Ostrich("Elliot");
		Flyer pegasus2 = new Pegasus("Ziho");
		
		/* test Magpie through Flyer interface */
		System.out.println(magpie2.getName() == "ECWU");
		System.out.println(magpie2.canFly() == true);
		
		/* test Ostrich through Flyer interface */
		System.out.println(ostrich2.getName() == "Elliot");
		System.out.println(ostrich2.canFly() == false);
		
		/* test Pegasus through Flyer interface */
		System.out.println(pegasus2.getName() == "Ziho");
		System.out.println(pegasus2.canFly() == true);
		
	}
}
