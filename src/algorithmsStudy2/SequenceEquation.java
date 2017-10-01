/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/permutation-equation
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SequenceEquation {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int[] p_inverse = new int[n+1];
		for(int x=1; x<=n; x++) {
			int px = Integer.parseInt(s[x-1]);
			p_inverse[px] = x;
		}
		br.close();
		
		for(int x=1; x<=n; x++) {
			int y = p_inverse[p_inverse[x]];
			System.out.println(y);
		}
	}
}
