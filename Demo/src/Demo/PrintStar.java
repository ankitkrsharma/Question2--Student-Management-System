package Demo;


public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starPrinter(4,1);
		

	}
	public static void printSpace(int row ,int num) {
		if(num-row<=0) {
			return;
		}
		System.out.print(" ");
		row++;
		printSpace(row, num);
		
		
	}
	public static void printStar(int row) {
		if(row--<0) return;
		System.out.print("*");
		printStar(row);
			
		
	}
	public static void starPrinter(int num,int row) {
		if(row>num) {
			return;
		}
		printSpace(row,num);
		printStar(row);
		printSpace(row, num);
		System.out.println();
		row++;
		starPrinter(num, row);
		
		
	}

}
