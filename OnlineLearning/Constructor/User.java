/* Constructor function overloading
 * Author Frank Ng
 */

public class User {
	int id;//id
	String name;//username
	String pw;//password
	
	public User() {
		
	}
	
	public User(int id, String name) {
		super();//the first line of constructor function
		this.id = id;
		this.name = name;
	}
	
	public User(int id, String name, String pw) {
		this.id = id;
		this.name = name;
		this.pw = pw;
	}
	
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User(101, "Frank");
		User u3 = new User(100, "ECWU", "123456");
		
		System.out.println(u2.name);
	}
}
