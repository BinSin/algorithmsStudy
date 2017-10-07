/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/equality-in-a-array?h_r=next-challenge&h_v=zen
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualizeTheArray {

	public static int NumberOfDeleteElements(int[] c, int n) {
		int max = c[0];
		for(int i=1; i<101; i++) {
			if(max < c[i]) {
				max = c[i];
			}
		}
		return n - max;
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int[] countElements = new int[101];
		for(int i=0; i<n; i++) {
			countElements[Integer.parseInt(s[i])]++;
		}
		System.out.println(NumberOfDeleteElements(countElements, n));
	}
}