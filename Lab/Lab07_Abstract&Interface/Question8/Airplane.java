/**
 * 
 * @author Frank Ng
 *
 */

public class Airplane implements Flyer{

	private String name;
	
	public Airplane(String name) {//constructor
		this.name = name;
	}
	
	@Override
	public boolean canFly() {//override to make it can fly
		return  true;
	}

	@Override
	public String getName() {//override get name
		return name;
	}
	
	public static void testAirplane() {
		Airplane ap1 = new Airplane("A350");
		
		System.out.println(ap1.getName() == "A350");//test get name
		System.out.println(ap1.canFly() == true);//test can fly
	}
}
