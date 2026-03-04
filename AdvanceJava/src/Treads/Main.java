package Treads;


class A implements Runnable{
	int count=0;
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			show();
			
		}
		
		
	}
	public void show() {
		count++;
	}
	
}

public class Main {
	public static void main(String[] args) {
		A a=new A();
		Thread t1=new Thread(a);
		t1.start();
		try {
			t1.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(a.count);
		
	}

}
