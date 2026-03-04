package Demo;

public class BitMasking {
	public static boolean is_anagram(String s,String b) {
		int num1=0;
		for(char ch:s.toCharArray()) {
			num1=num1|(1<<(ch-'b'));
			
		}
	
		for(char ch:b.toCharArray()) {
			num1=num1&(~(1<<(ch-'b')));
			
		}
		return num1==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check anagram given a>char>z for each char in string
		String s="abbba";
		String b="basab";
		System.out.println((is_anagram(s,b)?"yes":"no"));
		

	}

}
