import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		Integer[] arr;
		int t, n;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	    t=Integer.parseInt(br.readLine().trim());
	    t = (t>100) ? 100 : t;
	    
	    while(t>0){
	        
	   	   n=Integer.parseInt(br.readLine().trim());
	       n=(n>1000) ? 1000 : n;
	       
           String s[]=br.readLine().split(" ");
           
           arr = new Integer[n];
           for(int i=0; i<n; i++) {
        	   arr[i]=Integer.parseInt(s[i].trim());
           }
           int result = findFirstNonRepeatingElement(arr,n);
 	       System.out.println(result);
           
	        t--;
	    }
	}

	private static int findFirstNonRepeatingElement(Integer[] arr, int n) {
		int result=0;
		Map<Integer,Integer> elemCountMap = new HashMap<Integer,Integer>();
		for(int i=0; i<n; i++) {
			if(elemCountMap.containsKey(arr[i])) {
				elemCountMap.put(arr[i], elemCountMap.get(arr[i])+1);
			}else {
				elemCountMap.put(arr[i],1);
			}
		}
		for(int i=0; i<n; i++) {
			//System.out.println(arr[i]+"has occurrences"+elemCountMap.get(arr[i]));
			if(elemCountMap.get(arr[i])<2) {
				return arr[i];
			}
		}
		
		return result;
	}
	
}