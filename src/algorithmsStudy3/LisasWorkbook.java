/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/lisa-workbook
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LisasWorkbook {
	
	public static int numberOfSpeicalProblems(int[] t, int n, int k) {
		int problemNum = 0;

		int page = 0;
		if(k == 1) {
			for(int i=1; i<=n; i++) {
				problemNum+=t[i];
			}
		}
		else {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=t[i]; j++) {
					if(j % k == 1) {
						page++;
					}
					if(page == j)
						problemNum++;
				}
			}
		}
		return problemNum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int[] t = new int[n+1];
		
		String str2 = br.readLine();
		String[] s2 = str2.split("\\s+");
		for(int i=1; i<=n; i++) {
			t[i] = Integer.parseInt(s2[i-1]);
		}
		System.out.println(numberOfSpeicalProblems(t, n, k));
	}
}
