package Demo;

public class CheckAnagram {
//	public static String changeCase(String str) {
//		
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
//				str.charAt(i)=str.charAt
//			}
//			
//		}
//		return str;
//	}
	//method to remove space from beginning of string
	public static String removeSpaceFromStart(String str) {
	    int i = 0;

	    
	    while (i < str.length() && str.charAt(i) == ' ') {
	        i++;
	    }

	    
	    return str.substring(i);
	}
	private static boolean checkPalindrone(String str) {
		// TODO Auto-generated method stub
		int i=0;
		int j=str.length()-1;
		
		while(i++<j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			
		}
		return true;

	}
	public static void main(String[] args) {
		
		String str1="abba";
		System.out.println(str1);
		//int[] freq=new int[str1.length()];
		System.out.println(checkPalindrone(str1)?"yes":"no");
		
	}

}
