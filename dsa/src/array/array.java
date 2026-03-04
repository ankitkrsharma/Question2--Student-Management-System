package array;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class array {
	// Insertion at a position
	public static int[] insertAt(int pos, int num, int arry1D[]) {
		int[] arry = new int[10];
		int pre = 0;
		int next;
		for (int i = 0; i < arry.length; i++) {
			if (i < pos) {
				arry[i] = arry1D[i];
			} else if (i == pos) {
				arry[i] = num;

			} else {
				arry[i] = arry1D[i - 1];

			}
		}
		return arry;
	}
	


	
	
	
	// Delete element
	
	private static int []  deleteElement(int[] arry,int ele) {
		int j=0;
		
		// TODO Auto-generated method stub
		for(int i=0;i<arry.length-1;i++) {
			if(arry[i]==ele) {
				arry[i]=arry[i+1];
				j=i+1;
				break;
			}
			
		}
		for (int i = j; i < arry.length-1; i++) {
			arry[i]=arry[i+1];
			
		}
		
		return arry;

	}
	
	// first defect
	public static int binary(char[] chr, int start ,int end) {
		if(start>end) return -1;
		int mid=(start+(end-start)/2);
		if(chr[mid]=='f') {
			if(mid>0 && chr[mid-1]=='p') return mid-1;
			else {
				return binary(chr, 0,mid-1);
			}
		}
		else {
			if(mid<end &&chr[mid+1]=='f') {
				return mid+1;
			}
			else {
				return binary (chr, mid+1,end);
			}
		}
	
		
	}			
	public static int defect(char[] chr) {
		return binary(chr, 0, chr.length-1);
		
	}

	private static int[] reverse(int[] arry, int start, int end) {
	    while (start 
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		< end) {
	        int temp = arry[start];
	        arry[start] = arry[end];
	        arry[end] = temp;
	        start++;
	        end--;
	    }
	    return arry;
	}
	public static void topKfreq(int [] arry,int k) {
		int[] res=new int[arry.length];
		HashMap<Integer,Integer> hash=new HashMap<Integer, Integer>();
		for(int i:arry) {
			hash.put(i,hash.getOrDefault(i,0)+1);
		}
//		Collections.sort(hash, ()->);
//		for(int i=0;i<k;i++) {
//			arry[i]=hash.keySet().toArray().get(i);
//		}
//		return res;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array declaration
//		int[] arry1D = new int[10];
//
//		for (int i = 0; i < arry1D.length; i++) {
//			arry1D[i] = i + 10;
//
//		}
		//
		// rotating the arry by num numbers;
//		int num=3;
//		int len=arry1D.length;
//	
//		int [] arry2=reverse(reverse(reverse(arry1D,0,len-num-1),len-num,len-1),0,len-1);
		//
		//
		
	
		//print the array
//		for (int i = 0; i < arry2.length; i++) {
//			System.out.println(arry2[i]);
//		}
//		
//		char[] chr= {'p','p','p','p'};
//		System.out.println(defect(chr));
		
	}
}
