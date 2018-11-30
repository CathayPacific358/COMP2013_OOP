/**
 * 
 * @author Frank Ng
 *
 */
public class Dog extends Animal {

	public Dog(String name) {//constructor
		super(name);
	}

	@Override
	public int getLegs() {//override and return 4 legs
		return 4;
	}

	@Override
	public boolean canFly() {//override and return false
		return false;
	}
	
	public static void testDog() {
		Dog dog1 = new Dog("WildDog");
		
		System.out.println(dog1.getName() == "WildDog");//test get name
		System.out.println(dog1.getLegs() == 4);//test get legs
		System.out.println(dog1.canFly() == false);//test can fly
	}
}
