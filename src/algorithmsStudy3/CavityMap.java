/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/cavity-map
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CavityMap {
	
	public static void depictCavity(String[] depths, int n) {
		if(n > 1) {
			System.out.println(depths[0]);
		}
		for(int i=1; i<n-1; i++) {
			StringBuilder sb = new StringBuilder(depths[i]);
			char[] c_depth = depths[i].toCharArray();
			char[] lu_depth = depths[i-1].toCharArray();
			char[] ld_depth = depths[i+1].toCharArray();
			for(int j=1; j<n-1; j++) {
				if((c_depth[j] > c_depth[j-1]) && (c_depth[j] > c_depth[j+1]) &&
						(c_depth[j] > lu_depth[j]) && (c_depth[j] > ld_depth[j])) {
					sb.setCharAt(j, 'X');
				}
			}
			System.out.println(sb.toString());
		}
		System.out.println(depths[n-1]);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] depths = new String[n];
		for(int i=0; i<n; i++) {
			depths[i] = br.readLine();
		}
		depictCavity(depths, n);
	}
}
