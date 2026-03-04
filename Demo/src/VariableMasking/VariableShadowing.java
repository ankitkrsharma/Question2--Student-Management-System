package VariableMasking;

public class VariableShadowing {
	static int y=10;
	int x=40;
//	public static int method() {
//		int x=30;
//		return x;
//	}
	void show() {
		int x =50;
		int y=60;
		
		System.out.println(x);
		//System.out.println(method());
		System.out.println(this.x);
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(VariableShadowing.y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	.System.out.println(x);
	//	System.out.println(method());
		//VariableShadowing.show();
		//System.out.println();
		
		

	}

}
