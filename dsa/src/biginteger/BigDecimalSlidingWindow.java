package biginteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalSlidingWindow {
	public static List<BigDecimal> movingAverage(BigDecimal[] num, int k) {
		// TODO Auto-generated method stub
		List<BigDecimal> list=new ArrayList<BigDecimal>();
		BigDecimal sum=BigDecimal.ZERO;		
		for(int i=0;i<k;i++) {
			sum=sum.add(num[i]);
		}
		int i=0;
		int l=k-1;
		
		while(l<num.length) {
		    list.add(sum.divide(BigDecimal.valueOf(k), 2, RoundingMode.HALF_UP));
			sum=sum.subtract(num[i]);
			l++;
			if(l<num.length) sum=sum.add(num[l]);
			i++;
			
			
		}
		
		
		
		
		return list;

	}
	
	 public static void main(String[] args) {

	        String[] prices = {
	            "101.23","99.50","100.75","98.40","102.10","101.90"
	        };
	       // BigDecimal num=Arrays.stream(prices).maptoObj(x->BigDecimal.valuesof(x)).toList();
	        BigDecimal[] num = Arrays.stream(prices)
	                .map(BigDecimal::new)
	                .toArray(BigDecimal[]::new);

	        int k = 3;

	        List<BigDecimal> ans = movingAverage(num, k);

	        System.out.println(ans);
	    }

}
