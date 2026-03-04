package Demo;

public class Lazy {
	int i=10;
	public static Lazy getLazy() {
		Lazy lazy=new Lazy();
		return lazy;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Lazy.getLazy().i);

	}

}
