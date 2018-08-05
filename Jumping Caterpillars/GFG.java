import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] arr;
		int t, n, k;
		
		Scanner sc = new Scanner(System.in);
		
	    t = sc.nextInt();
	    t = (t>100) ? 100 : t;
	    
	    while(t>0){
	        
	       n = sc.nextInt();
	       n = (n>1000) ? 1000 : n;
	       
	       k = sc.nextInt();
	       k = (k>1000) ? 1000 : k;
	    
	       arr = new int[k];
	       for(int i=0;i<k;i++){
	           arr[i] = sc.nextInt();
	       }
	       
	       int result = countOfleavesRemaining(arr,n,k);
	       System.out.println(result);
	        
	        t--;
	    }
	}

	private static int countOfleavesRemaining(int[] arr, int n, int k) {
		List<Integer> leaves=new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			leaves.add(i);
		}
		
		for(int i=0; i<k; i++) {
			int leaveNum=0;
			while(leaveNum<=n) {
				leaveNum=leaveNum+arr[i];
				int leaveIndex=Collections.binarySearch(leaves, leaveNum);
				if(leaveIndex>=0) {
					leaves.remove(leaveIndex);
				}
			}
		}
		return leaves.size();
	}
	
}