package biginteger;

import java.math.BigInteger;

public class BigPrimeCheck {
	public static boolean primeCheck( BigInteger num) {
		
		 if(num.compareTo(BigInteger.ONE)<1) return false;
		 for(BigInteger i=BigInteger.valueOf(2);i.multiply(i).compareTo(num) <=0;i=i.add(BigInteger.ONE)) {
			 if(num.mod(i).equals(BigInteger.ZERO)) {
				 return false;
				 
			 }
			 
		 }
		 return true;
		 
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger num=BigInteger.valueOf(2);
		System.out.println(primeCheck(num)?"yes":"no");
		

	}

}
