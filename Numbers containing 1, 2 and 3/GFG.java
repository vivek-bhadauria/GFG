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
	       n=(n>1000000) ? 1000000 : n;
	       
           String s[]=br.readLine().split(" ");
           
           /*arr = new Integer[n];
           for(int i=0; i<n; i++) {
        	   arr[i]=Integer.parseInt(s[i].trim());
           }*/
           List<Integer> result = findMaximizedSum(s,n);
 	       for(int i=0; i<result.size(); i++) {
 	    	   if(i==result.size()-1) {
 	    		   System.out.print(result.get(i));
 	    	   }else {
 	    		   System.out.print(result.get(i)+" ");
 	    	   }
 	       }
 	       System.out.println("");
           
	        t--;
	    }
	}

	private static List<Integer> findMaximizedSum(String[] s, int n) {
		List<Integer> outList = new ArrayList<Integer>();
		
		//Arrays.sort(s);
		outer: for(int i=0; i<n; i++) {
			String currentString=s[i];
			for(int j=0; j<currentString.length(); j++) {
				char currentChar=currentString.charAt(j);
				if(currentChar!='1' && currentChar!='2' && currentChar!='3') {
					continue outer;
				}	
			}
			outList.add(Integer.parseInt(currentString));
		}
		if(outList.size()==0) {
			outList.add(-1);
		}
		Collections.sort(outList);
		return outList;
	}
	
}