package Demo;

public class User {
	String email;
	String name;
	
	 public User(String email, String name) {
		super();
		this.email = email;
		this.name = name;
	}
	String address;
	

	 public User(String email, String name, String address) {
		this(email,name);
		this.address = address;
	}


	 public static void main(String[] args ) {
		 User u1 = new User("fasf0","sgagr","gareg");
		 System.out.println(u1.email);
		 System.out.println(u1.name);

		 User u2 = new User("dsgdg","sgaerg");
		 System.out.println(u2.email);
		 System.out.println(u2.name);
		 System.out.println(u2.address);
		 
	 }

}
