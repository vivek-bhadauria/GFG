import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Integer[] arr;
		int t, n;
		
		Scanner sc = new Scanner(System.in);
		
	    t = sc.nextInt();
	    t = (t>100) ? 100 : t;
	    
	    while(t>0){
	        
	       n = sc.nextInt();
	       n = (n>50) ? 50 : n;
	    
	       arr = new Integer[n];
	       for(Integer i=0;i<n;i++){
	           arr[i] = sc.nextInt();
	       }
	       Arrays.sort(arr);
	       int sum=maximizeSelectedSum(arr,n);
	       System.out.println(sum);
	        
	        t--;
	    }
	}

	private static int maximizeSelectedSum(Integer[] arr, int n) {
		int sum=0;
		LinkedList<Integer> list=new LinkedList<Integer>(Arrays.asList(arr));
		while(true) {
			if(list.size()==0) {
				break;
			}
			Integer num = list.get(list.size()-1);
			sum = sum + num;
			list.removeLastOccurrence(num);
			list.removeLastOccurrence(num-1);
			
		}
		
		return sum;
	}
	
}
