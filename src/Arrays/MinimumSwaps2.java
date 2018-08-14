package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinimumSwaps2 {

	public static int minimumSwaps(int[] arr, int n) {
		int count = 0;

		int[] arr2 = arr.clone();
		Arrays.sort(arr2);
		
		for(int i=0; i<n-1; i++) {
			if(arr[i] != arr2[i]) {
				count++;
				for(int j=i+1; j<n; j++) {
					if(arr2[i] == arr[j]) {
						int tmp = arr[j];
						arr[j] = arr[i];
						arr[i] = tmp;
						break;
					}
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		System.out.println(minimumSwaps(arr, n));
	}
}
