
public class Start {

	public static String check(Student Stu) {
		if(Stu.isSleeping()) {
			return "Sweet dreams";
		}else {
			return "Need coffee";
		}
	}
	
	public static String check(Chicken Chicken) {
		if(Chicken.isSleeping()) {
			return "Sweet dreams";
		}else {
			return "Need coffee";
		}
	}
	
	public static void main(String[] args) {
		Student.testStudent();
		Student stuForCheck = new Student(1234567899);//new an object from Student
		System.out.println(check(stuForCheck) == "Need coffee");//initially the student is awaked
		stuForCheck.fallAsleep();
		System.out.println(check(stuForCheck) == "Sweet dreams");//test after falling asleep
		
		Chicken.testChicken();
		Chicken chickForCheck = new Chicken(2.5);//new an object from Chicken
		System.out.println(check(chickForCheck) == "Sweet dreams");//initially the chicken is sleeping
		chickForCheck.wakeUp();//wake it up
		System.out.println(check(chickForCheck) == "Need coffee");//test after waking up
	}
}

	/*The check method should be static. Because the main method is static and in the
	 * same class with check(). If we want check() to work while it is not static, we
	 * need to new a object from class Start.
	 */
