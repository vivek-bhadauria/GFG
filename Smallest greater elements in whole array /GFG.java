import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Integer[] arr,sortedArr;
		int t, n;
		
		Scanner sc = new Scanner(System.in);
		
	    t = sc.nextInt();
	    t = (t>100) ? 100 : t;
	    
	    while(t>0){
	        
	       n = sc.nextInt();
	       n = (n>100) ? 100 : n;
	    
	       arr = new Integer[n];
	       for(Integer i=0;i<n;i++){
	           arr[i] = sc.nextInt();
	       }
	       sortedArr = Arrays.copyOf(arr, n);
	       Arrays.sort(sortedArr);
	       /*for(int i=0; i<sortedArr.length; i++) {
	    	   if(i==sortedArr.length - 1) {
		    	   System.out.println(sortedArr[i]);
	    	   }else {

		    	   System.out.print(sortedArr[i]+" ");
	    	   }
	       }*/
	       
	       
	       String[] outputArr = smallestGreaterElems(arr,sortedArr,n);
	       for(int i=0; i<outputArr.length; i++) {
	    	   if(i==outputArr.length - 1) {
		    	   System.out.println(outputArr[i]);
	    	   }else {

		    	   System.out.print(outputArr[i]+" ");
	    	   }
	       }
	       //System.out.println("");
	        
	        t--;
	    }
	}

	private static String[] smallestGreaterElems(Integer[] arr, Integer[] sortedArr, int n) {
		String[] outputArr = new String[n];
		for(int i=0; i<n; i++) {
			int sortedArrIndexOfElem = Arrays.binarySearch(sortedArr, arr[i]);
			if(sortedArrIndexOfElem==n-1){
				outputArr[i]="_";
			}else {
				//int k=0;
				while(arr[i].equals(sortedArr[sortedArrIndexOfElem])) {
					//k++;
					if(sortedArrIndexOfElem==n-1){
					    break;
					}
					sortedArrIndexOfElem++;	
				}
				if(arr[i].equals(sortedArr[sortedArrIndexOfElem])) {
					outputArr[i]="_";
				}else {
					outputArr[i]=sortedArr[sortedArrIndexOfElem].toString();	
				}
			}
		}
		return outputArr;
	}
	
}