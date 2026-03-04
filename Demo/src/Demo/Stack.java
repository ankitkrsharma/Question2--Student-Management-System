package Demo;

public class Stack {
	int[] arry;
	int top;
	int size;
	Stack(int size){
		int[] arry=new int [size];
		this.size=size;
		this.arry=arry;
		this.top=-1;
		
		
	}
	public void push(int ele) {
		if(top++==size-1) {
			System.out.println("OverFlow");
		
		}else {
			arry[top]=ele;
			
		}
		
		return;
		
		
		
	}
	public int pop() {
		if(top<0) {
			System.out.println("UnderFlow");
		}
		
		return arry[top--];
	}
	public int peek() {
		if(top==-1) {
			System.out.println("UnderFlow");
		}
		
		return arry[top];
		
	}
	public void print() {
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
	}
	public static void main(String args[]) {
		Stack st=new Stack(2);
		st.push(3);
		st.push(5);
		st.push(5);
		st.pop();
		st.pop();
		st.pop();
	
		
		
		st.print();
		

		
	}

	

}
