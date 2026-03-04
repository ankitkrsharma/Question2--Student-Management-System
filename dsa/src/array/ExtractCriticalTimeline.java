package array;
import java.util.*;



public class ExtractCriticalTimeline {

    // 👇👇 You will implement this
	public static List<List<String>> filter(List<List<String>> llogs){
		List<List<String>> temp=new ArrayList<>();
		
		for(List<String> ele:llogs) {
			if((ele.get(3).equals("ERROR")||ele.get(3).equals("CRITICAL"))&&ele.get(2)=="API") {
				temp.add(ele);
				
			}
			
			
		}
		return temp;
		
		
		
	}
	public static List<Integer> getkey(String s){
		List<Integer> temp=new ArrayList<Integer>();
		String[] s_array=s.split(":");
		for(String str:s_array) {
			temp.add(Integer.parseInt(str));
		}
		return temp;
		
	}
	

    public static List<String> extractCriticalTimeline(String[][] logs) {

        // ================================
        // WRITE YOUR LOGIC HERE
        // ================================
    	//Convert string[][] array to list of list of string
    	List<List<String>> llogs=new ArrayList<>();
    	for(String[] ele:logs) {
    		List <String> temp=new ArrayList<>();
    		for(String str:ele) {    		
    			temp.add(str);
    		}
    		llogs.add(temp);
    	}
    	llogs=filter(llogs);
    	
    	
    	//Sorting
    	
    	Collections.sort(llogs,(i,j)->{
    	
    		List<Integer> a =getkey(i.get(1));
    		List<Integer> b =getkey(j.get(1));
    		if(a.get(0).compareTo(b.get(0))!=0) 
    			return a.get(0).compareTo(b.get(0));
    		else {
    			if(!i.get(3).equals(j.get(3))) return i.get(3).equals("CRITICAL")?1:-1;
    			
    			else {
    				return i.get(4).compareTo(j.get(4));
    			}
    		}
    		
    		});
    	List<String> output=new ArrayList<>();
    	for(List<String> strList:llogs) {
    		String s=strList.get(1)+" "+strList.get(2)+" "+strList.get(3)+" "+strList.get(4);
    		output.add(s);
    	}
    	return output;
    	
}

    // 👇 MAIN METHOD (Ready to Run)
    public static void main(String[] args) {

        String[][] logs = {
            {"01-01-2023","14:00","AUTH","ERROR","M102","failed"},
            {"01-01-2023","14:00","AUTH","CRITICAL","M101","panic"},
            {"01-01-2023","15:00","API","ERROR","M200","skip"},
            {"01-01-2023","01:30","API","ERROR","M051","down"},
            {"01-01-2023","01:30","API","ERROR","M050","duplicate"}
        };

        List<String> result = extractCriticalTimeline(logs);

        System.out.println("===== OUTPUT =====");

        for(String r : result){
            System.out.println(r);
        }
    }
}