
public class Person {

	private String name;
	private BankAccount account;
	private Motorcycle motorcycle;

	public Person(String name, int money, Motorcycle motorcycle) {// constructor
		this.name = name;
		this.account = new BankAccount(money);
		this.motorcycle = motorcycle;
	}

	public String getDescr() {// function get description of the person
		return name + " has " + account.getMoney() + " yuans and a " + motorcycle.getColour() + " motorcycle with "
				+ motorcycle.getGasoline() + " liters of gasoline";
	}

	public void buyGasoline(int money) {// function to buy gasoline
		if (money % 8 != 0) {//if is NOT multiple of 8
			if ((account.getMoney() - (money / 8) >= 0)) {//test have enough money or not
				account.setMoney(account.getMoney() - (money / 8) * 8);
				motorcycle.addGasoline(money / 8);
			}
		} else {//if is multiple of 8
			if ((account.getMoney() - (money / 8) >= 0)) {//test have enough money or not
				account.setMoney(account.getMoney() - money);
				motorcycle.addGasoline(money / 8);
			}
		}
	}

	public static void testPerson() {
		Motorcycle motor1 = new Motorcycle("Yellow", 100);
		Motorcycle motor2 = new Motorcycle("Red", 100);
		Person person1 = new Person("ECWU", 100, motor1);// object have money
		Person personNoMoney = new Person("Frank", 0, motor2);// object have no money

		/* Strings for description test */
		String strTest1 = "ECWU has 100 yuans and a Yellow motorcycle with 100 liters of gasoline";
		String strTest2 = "Frank has 0 yuans and a Red motorcycle with 100 liters of gasoline";

		/* Test for ordinary person (have money) */
		System.out.println(person1.getDescr().equals(strTest1));// test description
		person1.buyGasoline(20);// test buyGasoline() with money is NOT a multiple of 8
		System.out.println(person1.account.getMoney() == 84);
		System.out.println(person1.motorcycle.getGasoline() == 102);

		person1.buyGasoline(16);// test buyGasoline() with money is a multiple of 8
		System.out.println(person1.account.getMoney() == 68);
		System.out.println(person1.motorcycle.getGasoline() == 104);

		/* Test for person who has no money */
		System.out.println(personNoMoney.getDescr().equals(strTest2));// test description
		personNoMoney.buyGasoline(20);// test buyGasoline() with money is NOT a multiple of 8
		System.out.println(personNoMoney.account.getMoney() == 0);
		System.out.println(personNoMoney.motorcycle.getGasoline() == 100);

		personNoMoney.buyGasoline(16);// test buyGasoline() with money is a multiple of 8
		System.out.println(personNoMoney.account.getMoney() == 0);
		System.out.println(personNoMoney.motorcycle.getGasoline() == 100);

	}
}
