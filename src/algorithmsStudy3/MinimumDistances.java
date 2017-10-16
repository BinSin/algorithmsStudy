/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/minimum-distances
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumDistances {

	public static int minimumDistances(int[] a, int n) {
		int distance = 0;
		int min = n;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i] == a[j]) {
					distance = j - i;
					if(min > distance) {
						min = distance;
					}
				}
			}
		}
		
		if(min == n)
			return -1;
		else
			return min;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] s = str.split("\\s+");
		
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		System.out.println(minimumDistances(a, n));
	}
}
