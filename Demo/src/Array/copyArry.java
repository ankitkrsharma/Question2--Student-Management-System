package array;

public class copyArry {

	public static void main(String[] args) {
		int arr[] ={1,2,3,4,5};
		int b[]= new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			b[i]=arr[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
