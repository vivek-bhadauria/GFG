import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
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
	       
           String s[]=br.readLine().replaceAll(" +", " ").split(" ");
           
           arr = new Integer[n];
           for(int i=0; i<n; i++) {
        	   arr[i]=Integer.parseInt(s[i].trim());
           }
           
           String result = findNumbersWithGivenDigits(n,arr);
           if(result==null || result.trim().equals("")) {
        	   System.out.println("-1");
           }else {
        	   System.out.println(result);
           }
	        t--;
	    }
	}

	private static String findNumbersWithGivenDigits(int n, Integer[] arr) {
		return Arrays.asList(arr).stream().filter(num -> containsReqdDigit(num)).map(num -> num.toString()).collect(Collectors.joining(" "));
		
	}
	
	private static boolean containsReqdDigit(int num) {
		while(num>0) {
			int digit = num % 10;
			if(digit!=1 && digit!=2 && digit!=3) {
				return false;
			}
			num=num/10;
		}
		
		return true;
	}
	
	
}