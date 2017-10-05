/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/non-divisible-subset
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NonDivisibleSubset {
	
	public static int countMaxSubset(int[] setCount, int k) {
		int max = 0;
		if(setCount[0] > 0) max = 1;
		if(k % 2 == 0) {
			max += 1;
			for(int i=1; i<k/2; i++) {
				if(setCount[i] > setCount[k-i])
					max += setCount[i];
				else 
					max += setCount[k-i];
			}
		}
		else {
			for(int i=1; i<=k/2; i++) {
				if(setCount[i] > setCount[k-i])
					max += setCount[i];
				else 
					max += setCount[k-i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		
		String str2 = br.readLine();
		String[] s2 = str2.split("\\s+");
		int[] setCount = new int[k];
		for(int i=0; i<n; i++) {
			setCount[Integer.parseInt(s2[i]) % k]++;
		}
		System.out.println(countMaxSubset(setCount, k));
	}
}