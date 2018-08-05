import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		int[] arr;
		int t, n, k;
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	    t=Integer.parseInt(br.readLine());
	    t = (t>1000) ? 1000 : t;
	    
	    while(t>0){
	        
	       /*n = sc.nextInt();
	       n = (n>100000) ? 100000 : n;
	       
	       arr = new int[n];
	       for(int i=0;i<n;i++){
	           arr[i] = sc.nextInt();
	       }*/
	       
	   	   n=Integer.parseInt(br.readLine());
           String s[]=br.readLine().split(" ");
           arr=new int[n];

	   	   for(int i=0;i<n;i++) {
	   		   arr[i]=Integer.parseInt(s[i]);
	   	   }
	       
	       int[] result=easeArray(arr,n);
	       for(int i=0; i<result.length; i++) {
	    	   if(i==result.length-1) {
	    		   System.out.print(result[i]);
	    	   }else {
	    		   System.out.print(result[i]+" ");
	    	   }
	       }
	       System.out.println("");
	        
	        t--;
	    }
	}

	private static int[] easeArray(int[] arr, int n) {
		int[] outArr=new int[n];
		//First Operation
		for(int i=0; i<n-1; i++) {
			if(arr[i]!=0 && arr[i]==arr[i+1]) {
				arr[i]=2*arr[i];
				arr[i+1]=0;
			}
		}
		
		//Second Operation
		int k=0;
		int i=0;
		int j=n-1;
		while(i<=j && k<n) {
			if(arr[k]==0) {
				outArr[j]=arr[k];
				j--;
			}else {
				outArr[i]=arr[k];
				i++;
			}
			
			k++;
		}
		
		return outArr;
		
	}
	
}
