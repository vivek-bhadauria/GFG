import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException {
		Integer[] arr;
		int t, n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		t = Integer.parseInt(br.readLine().trim());
		t = (t > 100) ? 100 : t;

		while (t > 0) {

			n = Integer.parseInt(br.readLine().trim());
			n = (n > 10000) ? 10000 : n;

			String s[] = br.readLine().replaceAll(" +", " ").split(" ");

			arr = new Integer[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(s[i].trim());
			}

		    long result = findMaxSum(n, arr);
			System.out.println(result % 1000000007);
				
			t--;
		}
	}

	private static long findMaxSum(int n, Integer[] arr) {
		Arrays.sort(arr);
		long result = 0;
		int i = 0;
		int j = n - 1;
		//System.out.println(Arrays.asList(arr).stream().map(num ->
		//num.toString()).collect(Collectors.joining(" ")));
		/*if (j - i < 2) {
			if (arr[i] == 0) {
				return arr[j];
			} else {
				return arr[i] * arr[j];
			}
		}*/
		/*if (j - i == 2) {
			if (arr[i] == 0) {
				return arr[i] * arr[i + 1];
			} else if (arr[i + 1] == 0) {
				return arr[j];
			} else {
				return arr[j] * arr[i + 1] + arr[i];
			}
		}*/
		while (i < j) {

			if (arr[i] <= 0 && arr[i + 1] <= 0) {
				result = result + arr[i] * arr[i + 1];
				i = i + 2;
			}
			if (arr[j] > 0 && arr[j - 1] > 0) {
				result = result + arr[j] * arr[j - 1];
				j = j - 2;
			}
			if (arr[i]<= 0 && arr[j] > 0 && j==i+1 && n%2==0) {
				result = result + arr[i] * arr[j];
				i=i+1;
			}

		}
		if (n % 2 != 0) {
			result = result + arr[j];
		}
		return result;
	}

}