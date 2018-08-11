package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort {

	public static void countSwaps(int[] a, int n) {
		int count = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(a[j] > a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					
					count++;
				}	
			}
		}
		
		System.out.println("Array is sorted in " + count + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n-1]);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		countSwaps(a, n);
	}
}
