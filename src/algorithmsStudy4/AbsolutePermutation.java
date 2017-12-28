/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/absolute-permutation/problem
 */

package algorithmsStudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbsolutePermutation {

	public static void absolutePermutation(int n, int k) {
		if(k == 0) {
			for(int i=1; i<=n ; i++) {
				System.out.print(i + " ");
			}
		}
		else if(n % (k*2) != 0) {
			System.out.print(-1);
		}
		else {
			int temp = k;
			for(int i=1; i<=n ;i++) {
				System.out.print(i+temp + " ");
				if(i % k == 0)
					temp = temp * (-1);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			String str = br.readLine();
			String[] s = str.split("\\s+");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			absolutePermutation(n, k);
		}
	}
}
