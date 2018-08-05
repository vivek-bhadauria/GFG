import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		int t, n;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	    t=Integer.parseInt(br.readLine());
	    t = (t>100) ? 100 : t;
	    
	    while(t>0){
	        
	       /*n = sc.nextInt();
	       n = (n>100000) ? 100000 : n;
	       
	       arr = new int[n];
	       for(int i=0;i<n;i++){
	           arr[i] = sc.nextInt();
	       }*/
	       
	   	   n=Integer.parseInt(br.readLine());
	       n=(n>1000) ? 1000 : n;
	       
           String s[]=br.readLine().split(" ");
           
           String result = maxOccurringString(s,n);
 	       System.out.println(result);
           
	        t--;
	    }
	}

	private static String maxOccurringString(String[] s, int n) {
		String result = null;
		Map<String,Integer> wordCountsMap = new TreeMap<String,Integer>();
		for(int i=0; i<s.length; i++) {
			if(wordCountsMap.containsKey(s[i])) {
				wordCountsMap.put(s[i], wordCountsMap.get(s[i])+1);
			}else {
				wordCountsMap.put(s[i], 1);
			}
		}
		int max=0;
		for(String key : wordCountsMap.keySet()) {
			if(wordCountsMap.get(key)>max) {
				max=wordCountsMap.get(key);
				result=key;
			}
		}
		
		return result;
	}
	
	

	
}