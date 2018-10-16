/**
 * 
 * @author Frank Ng
 *
 */

public class LivingThing {

	private String name;
	
	public LivingThing(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static void testLivingThing(){
		LivingThing creature1 = new LivingThing("Ziho");
		
		System.out.println(creature1.name == "Ziho");
		System.out.println(creature1.getName() == "Ziho");//test get name
	}
}
