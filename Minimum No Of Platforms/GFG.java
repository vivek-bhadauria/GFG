import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		Integer[] startArr, endArr;
		int t, n;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	    t=Integer.parseInt(br.readLine().trim());
	    t = (t>100) ? 100 : t;
	    
	    while(t>0){
	        
	   	   n=Integer.parseInt(br.readLine().trim());
	       n=(n>1000) ? 1000 : n;
	       
           String s1[]=br.readLine().replaceAll(" +", " ").split(" ");
           
           startArr = new Integer[n];
           for(int i=0; i<n; i++) {
        	   startArr[i]=Integer.parseInt(s1[i].trim());
           }
           
           String s2[]=br.readLine().replaceAll(" +", " ").split(" ");
           
           endArr = new Integer[n];
           for(int i=0; i<n; i++) {
        	   endArr[i]=Integer.parseInt(s2[i].trim());
           }
           int result = findMinimumNumberOfPlatforms(n,startArr,endArr);
           System.out.println(result);
           
	        t--;
	    }
	}

	private static int findMinimumNumberOfPlatforms(int n, Integer[] startArr, Integer[] endArr) {
		
		Arrays.sort(startArr);
		Arrays.sort(endArr);
		
		int result=0;
		int i=0;
		int j=0;
		int noOfPlatformsRequired=0;
		while(i<n && j<n) {
			if(startArr[i]<=endArr[j]) {
				noOfPlatformsRequired++;
				i++;
				if(result<noOfPlatformsRequired) {
					result=noOfPlatformsRequired;
				}
			}else {
				noOfPlatformsRequired--;
				j++;
			}
		}
		
		return result;
	}
	
	
}