package Demo;

public class NonStaticOrder {
	int i=0;
	{
		System.out.println("Non static block 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start of main()");
		NonStaticOrder order=new NonStaticOrder();
		System.out.println("end of main()");

	}
	public void nonStaticMethod() {
		System.out.println("from non static method()");
		
	}
	public NonStaticOrder() {
		System.out.println("from constructor");
	}
	static{
		System.out.println("static block 2");
	}
	


}
