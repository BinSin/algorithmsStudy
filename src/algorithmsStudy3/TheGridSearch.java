/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/the-grid-search
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheGridSearch {

	public static String containsRectangular(String[] G, String[] P, int R, int C, int r, int c) {
		for(int i=0; i<=R-r; i++) {
			for(int j=0; j<=C-c; j++) {
				if(G[i].substring(j, j+c).equals(P[0])) {
					int ch = 0;
					for(int k=i+1, l=1; k<i+r; k++, l++) {					
						if(G[k].substring(j, j+c).equals(P[l])) {
							ch++;
						}
						if(ch == r-1)
							return "YES";
					}					
				}
			}
		}
		return "NO";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			String str = br.readLine();
			String[] s = str.split("\\s+");
			int R = Integer.parseInt(s[0]);
			int C = Integer.parseInt(s[1]);
			String[] G = new String[R];
			for(int i=0; i<R; i++) {
				G[i] = br.readLine();
			}
			String str2 = br.readLine();
			String[] s2 = str2.split("\\s+");
			int r = Integer.parseInt(s2[0]);
			int c = Integer.parseInt(s2[1]);
			String[] P = new String[r];
			for(int i=0; i<r; i++) {
				P[i] = br.readLine();
			}
			System.out.println(containsRectangular(G, P, R, C, r, c));
		}
	}
}
