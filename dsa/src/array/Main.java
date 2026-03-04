package array;

@FunctionalInterface
interface Calculator{
	int operate(int a,int b);
	
}
class Operates implements Calculator{
	public int operate(int a,int b) {
		return a+b;
	}
	
}



public class Main {
	public static double doubl(double num) {
		System.out.println("double method runs");
		return num*2;
		
	}
	
	

	public static void main(String[] args) {
		Operates op=new Operates();

//		Function<Double, Double> f=Main::doubl;
//		//System.out.println(f.apply(2));
//		System.out.println(doubl(2));
		
		Calculator o1=op::operate;
		System.out.println(o1.operate(2, 3));
		
	
		
	}
	

}
