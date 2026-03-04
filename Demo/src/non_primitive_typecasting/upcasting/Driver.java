package non_primitive_typecasting.upcasting;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Upacasting...
		Parent p = new Parent();
		System.out.println(p.p);
		p.pm();
		Child c = new Child();
		System.out.println(c.c);
		c.cm();
		System.out.println(c.p);
		c.pm();
		Child c1 = new Child();
		Parent p1 = c1;
		System.out.println(c1.c);
		c1.cm();
//Variables are accessed using reference type, not object type		
//		System.out.println(p1.c);
//		p1.cm();
		System.out.println(p1.p);
		p1.pm();
// DownCasting....
		System.out.println("Start of downcasting");
		Parent p2=new Parent();
//		Exception..
//		Child c2=(Child)p2;
//		System.out.println(c2.c);
		Child c3=new Child();
		Parent p3=c3;
		Child c4=(Child)p3;
		System.out.println(c4.c);
		c4.cm();
		System.out.println(p3.p);
		//.cm();
		System.out.println("End of down casting");
		
		
		

	}

}
