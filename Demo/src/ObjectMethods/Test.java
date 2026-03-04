package ObjectMethods;

public class Test {
	public static void main(String[] args) throws Exception {
		CloneOverriding c1=new CloneOverriding(101);
		CloneOverriding c2=(CloneOverriding)c1.clone();
		System.out.println(c1+" "+c2);
		
	}

}
