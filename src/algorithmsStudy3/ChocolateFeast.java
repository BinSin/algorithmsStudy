/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/chocolate-feast
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChocolateFeast {

	public static int totalNumberOfChocolates(int n, int c, int m) {
		int wrapperNumber = n / c;
		int count = n / c;
		
		while(wrapperNumber >= m) {
			count += wrapperNumber / m;
			wrapperNumber = wrapperNumber / m + wrapperNumber % m;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String str = br.readLine();
			String[] s = str.split("\\s+");
			int n = Integer.parseInt(s[0]);
			int c = Integer.parseInt(s[1]);
			int m = Integer.parseInt(s[2]);
			System.out.println(totalNumberOfChocolates(n, c, m));
		}
	}
}
