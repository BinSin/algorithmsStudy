/*
 * Author: BinSin
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JumpingOnTheClouds_Revisited {

	public static int remindEnergy(int[] c, int n, int k) {
		int usingEnergy = 0;
		for(int i=0; i<n; i+=k) {
			if(c[i] == 0) usingEnergy++;
			else usingEnergy+=3;
		}
		return 100 - usingEnergy;
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		
		int[]c = new int[n];
		String str2 = br.readLine();
		String[] s2 = str2.split("\\s+");
		for(int i=0; i<n; i++) {
			c[i] = Integer.parseInt(s2[i]);
		}
		
		System.out.println(remindEnergy(c, n, k));
	}
}
