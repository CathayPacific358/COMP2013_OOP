
public class BankAccount {

	private int money;
	
	public BankAccount(int money) {//constructor
		this.money = money;
	}
	
	public int getMoney() {//function to check the amount of money
		return money;
	}
	
	public void setMoney(int money) {//function to set the amount of money
		this.money = money;
	}
	
	public static void testBankAccount() {
		BankAccount originAccount = new BankAccount(20);//account with 20 yuans for test
		
		System.out.println(originAccount.getMoney() == 20);//test getMoney()
		originAccount.setMoney(30);//set money to 30
		System.out.println(originAccount.getMoney() == 30);//test the result of setting money
	}
}
