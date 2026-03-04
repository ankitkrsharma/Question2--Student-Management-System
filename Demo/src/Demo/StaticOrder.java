package Demo;

public class StaticOrder {
	static {
		System.out.println("static block 1");
	}
	static int i =printVal();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");

	}
	static {
		System.out.println("static block 2");
	}
	static int printVal() {
		System.out.println("static method");
		return 1;
	}

}
