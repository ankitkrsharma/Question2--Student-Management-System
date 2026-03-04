package Demo;

import java.util.Scanner;

public class Calculator2{
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		inputData();
		
	}
	public static String inputData(){
		String inputArgument=userInput.nextLine();
		return inputArgument;		
	}

}
