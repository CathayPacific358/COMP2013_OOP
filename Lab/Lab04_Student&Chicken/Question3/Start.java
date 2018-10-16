
public class Start {

	public static String check(Student Stu) {
		if(Stu.isSleeping()) {
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
	}
}
