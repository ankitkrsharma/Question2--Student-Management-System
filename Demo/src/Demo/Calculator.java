package Demo;

import java.util.Scanner;

public class Calculator {
	public int number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) calculate();

	}
	public static void calculate() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number :");
		double operandOne=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the operator :");
		char operator=sc.next().charAt(0);

		System.out.println("Enter the second number :");
		double operandTwo=sc.nextDouble();
		sc.nextLine();
		double result=0;
		switch(operator) {
		case '+':
			result=operandOne+operandTwo;
			break;
		
		case '-':
			result=operandOne-operandTwo;
			break;
		
		case '*':
			result=operandOne*operandTwo;
			break;

		case '/':
			if(operandTwo==0) {System.out.println("Invalid second number");break;}
			
			result=operandOne/operandTwo;
			break;
		
		}
		System.out.println(result);
	}

}
