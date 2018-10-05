/**
 * 
 * @author frank
 *
 */

public class Student {

	private int ID;
	private String name;
	private char grade = 'A';
	private boolean sleeping = false;

	public Student(int ID) {// constructor for ID
		/* use if to determine positive or negative */
		if (ID > 0) {
			this.ID = ID;
		} else {
			ID = 0;
		}
	}

	public Student(int ID, String name) {// constructor for ID and name
		this.name = name;
	}

	public Student(int ID, String name, char grade) {// constructor for ID, name and grade
		this.grade = grade;
	}

	public int getID() {// function getID
		return ID;
	}

	public String getName() {// function getName
		return name;
	}

	public void setName(String name) {// function setName
		this.name = name;
	}

	public char getGrade() {// function getGrade
		return grade;
	}

	public void setGrade(char grade) {// function setGrade
		this.grade = grade;
	}

	public boolean isSleeping() {//function isSleeping
		return sleeping;
	}

	public void goToSleep() {//function to make student sleep
		this.sleeping = true;//set sleeping to true
		
		/* A-E grade will decrease by one letter
		 * F or others will set grade to F
		 */
		if (grade < 'F') {
			grade = (char) ((int) grade + 1);
		} else {
			grade = 'F';
		}
	}
	
	public void wakeUp() {//function wakeUp
		this.sleeping = false;
	}

	public static void testStudent() {
		Student Stu01 = new Student(01);// object for Q1

		Student Stu02 = new Student(-1);// object for Q2

		Student Stu03 = new Student(03, "Wildman");// object for Q3
		Student Stu04 = new Student(04, "ECWU");// object for Q3
		Stu04.setName("Frank");// set name for Q3

		Student Stu05 = new Student(05, "Rory");// object for Q4
		Student Stu06 = new Student(06, "Quin");// object for Q4
		Stu06.setGrade('B');// set grade for Q4

		Student Stu07 = new Student(07, "Lennox", 'B');// object for Q5

		Student Stu08 = new Student(8, "Alienware", 'A');//object for Q6
		Student Stu09 = new Student(9, "TerrainsForce", 'D');//object for Q6
		Student Stu10 = new Student(10, "Macintosh", 'A');//object for Q6
		Stu09.goToSleep();//let Stu09 to sleep
		Stu10.goToSleep();//let Stu10 to sleep
		Stu10.wakeUp();//wake Stu10 up

		System.out.println(Stu01.getID() == 01);// Q1 test getID()
		System.out.println(Stu02.getID() == 0);// Q2 test negative
		System.out.println(Stu03.getName() == "Wildman");// Q3 test getName()
		System.out.println(Stu04.getName() == "Frank");// Q3 test setName()
		System.out.println(Stu05.getGrade() == 'A');// Q4 test getGrade()
		System.out.println(Stu06.getGrade() == 'B');// Q4 test setGrade()
		System.out.println(Stu07.grade == 'B');// Q5 directly set grade
		System.out.println(Stu08.isSleeping() == false);
		System.out.println(Stu09.grade == 'E');
		System.out.println(Stu10.grade == 'B');
		System.out.println(Stu10.isSleeping() == false);
	}
}
