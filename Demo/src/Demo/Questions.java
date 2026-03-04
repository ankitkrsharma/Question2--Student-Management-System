package Demo;
import java.util.Stack;

public class Questions {
	//Question 1: find the 3rd largest element
	private static int thirdLargest(int[] arr) {
	    if (arr.length < 3) {
	        throw new IllegalArgumentException("Array must contain at least 3 elements");
	    }

	    int first = Integer.MIN_VALUE;
	    int second = Integer.MIN_VALUE;
	    int third = Integer.MIN_VALUE;

	    for (int num : arr) {
	        if (num > first) {
	            third = second;
	            second = first;
	            first = num;
	        } 
	        else if (num > second && num != first) {
	            third = second;
	            second = num;
	        } 
	        else if (num > third && num != second && num != first) {
	            third = num;
	        }
	    }
	    return third;
	}
	
	//Question 2 : Sum of all the element in 2D array
	
	private static int sum2D(int[][] array) {
		int res=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				res+=array[i][j];
			}
			
		}
		return res;
	}
	
	//Question 3: Check for balanced parenthesis
	
	private static boolean isBalanced(String str) {
	    Stack<Character> stk = new Stack<>();

	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);

	        if (ch == '(') {
	            stk.push(ch);
	        } 
	        else if (ch == ')') {
	            if (stk.isEmpty()) {
	                return false;
	            }
	            stk.pop();
	        }
	    }

	    return stk.isEmpty();
	}
	
	//Question 4: check whether a pattern exists in a given string.
	
	private static boolean patternMatch(String str,String pattern) {
		int len=pattern.length();
		for (int i = 0; i < str.length()-len; i++) {
			if(str.substring(i,i+len).equals(pattern)) return true;
			
		}
		return false;
		
		
	}
	
	
	// Question 5: reverse the Sentence
	
	private static String  reverseSentnce(String str) {
		StringBuffer output=new StringBuffer();
		String[] words=str.split("\\s+");
		for (int i = words.length-1; i >=0; i--) {
			output.append(words[i]);
			if(i!=0) {
				output.append(" ");
			}
			
		}
		return output.toString();
		
	}
	
	//Bubbile

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q1
		int[] arry= {1,2,3};
		System.out.println(thirdLargest(arry));
		//
		
		//Q2
		int[][] arry2D= {{1,2},{4,5,6}};
		System.out.println(sum2D(arry2D));
		//
		
		//Q3
		System.out.println(isBalanced("(enkd(nke(nkd)))")?"yes":"no");
		//
		
		//Q4
		System.out.println(patternMatch("ankit","ant")?"yes":"no");
		//
		
		//Q5
		System.out.println(reverseSentnce("I Love Programming"));
		
		

	}

}
