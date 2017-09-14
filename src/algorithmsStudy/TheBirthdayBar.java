/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/the-birthday-bar
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBirthdayBar {

	static int arrSum(int to, int from, int []s) {
		int sum = 0;
		for(int i=to; i<from; i++) {
			sum += s[i];
		}
		return sum;
	}
	
	static int solve(int n, int[] s, int d, int m) {
		int count = 0;
		for(int i=0; i<n+1-m; i++) {
			if(arrSum(i, i+m, s) == d) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
		int n = Integer.parseInt(br.readLine());
		int[] s = new int[n];
		
		String sv = br.readLine();
		String[] sva = sv.split("\\s");
		for(int s_i=0; s_i<n; s_i++) {
			s[s_i] = Integer.parseInt(sva[s_i]);
		}
		
		int[] s2 = new int[2];
		String sv2 = br.readLine();
		String[] sva2 = sv2.split("\\s");
		for(int s_i=0; s_i<2; s_i++) {
			s2[s_i] = Integer.parseInt(sva2[s_i]);
		}
		
		int d = s2[0];
		int m = s2[1];
		int result = solve(n, s, d, m);
		
		System.out.println(result);
	}
}
