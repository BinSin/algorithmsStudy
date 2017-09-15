/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/divisible-sum-pairs
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisibleSumePairs {

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if((ar[i] + ar[j]) % k == 0) count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		
		String str2= br.readLine();
		String[] s1 = str2.split("\\s");
		int[] ar = new int[n];
		for(int i=0; i<n; i++) {
			ar[i] = Integer.parseInt(s1[i]);
		}
		int result = divisibleSumPairs(n, k, ar);
		System.out.println(result);
	}
}
