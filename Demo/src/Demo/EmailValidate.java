package Demo;

public class EmailValidate {
	public static String[] TLD= {
			".com",
			".in",
			".edu"
	};
	public static boolean validateEmail(String email) {
		if(!(email.contains("@"))) {
			
			
		}
		return  true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="ankit@gmail.com";
		System.out.println((validateEmail(email)?"It is valide email":"It is not a valide email"));
	

	}

}
