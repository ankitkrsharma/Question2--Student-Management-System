package Demo;

public class MixedOrder {
	static int ab = 10;
	static {
	    System.out.println(ab);
	}
	static int ba = 20;


    static int a = printStatic("static variable a");

    int x = printInstance("instance variable x");

    static {
        System.out.println("static block 1");
    }

    {
        System.out.println("instance block 1");
    }

    static int b = printStatic("static variable b");

    {
        System.out.println("instance block 2");
    }

    public MixedOrder() {
        System.out.println("constructor");
    }

    static {
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
        System.out.println("start of main");
        new MixedOrder();
        new MixedOrder(); 
        System.out.println("end of main");
    }

    static int printStatic(String msg) {
        System.out.println(msg);
        return 10;
    }

    int printInstance(String msg) {
        System.out.println(msg);
        return 20;
    }
}
