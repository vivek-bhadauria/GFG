import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		Integer[] arr;
		int t, n;
		
		Scanner sc = new Scanner(System.in);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	    //t=Integer.parseInt(br.readLine());
		t=sc.nextInt();
	    t = (t>100) ? 100 : t;
	    
	    while(t>0){
	        
	   	   //n=Integer.parseInt(br.readLine());
	       n=sc.nextInt();
	       n=(n>1000) ? 1000 : n;
	       
           //String s[]=br.readLine().split(" ");
           
           arr = new Integer[n];
           for(int i=0; i<n; i++) {
        	   //arr[i]=Integer.parseInt(s[i].trim());
        	   arr[i]=sc.nextInt();
           }
           Arrays.sort(arr);
           String result = hasContinuousElements(arr,n);
 	       System.out.println(result);
           
	        t--;
	    }
	}

	private static String hasContinuousElements(Integer[] arr, int n) {
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		if(min==max) {
			return "Yes";
		}
		
		int numToSearch=min;
		int i=0;
		while(i<arr.length) {
			//System.out.println("Comparing : "+numToSearch+" with "+arr[i]);
			if(arr[i]!=numToSearch) {
				return "No";
			}
			while(i<arr.length && arr[i]==numToSearch) {
				i++;
			}
			numToSearch++;
		}
		return "Yes";
	}
	
}