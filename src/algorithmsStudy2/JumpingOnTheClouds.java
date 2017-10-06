/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JumpingOnTheClouds {

	public static int numberOfJumps(int[] c, int n) {
		int count = 0;
		int location = 0;
		while(location < n-1) {
			count++;
			if(c[location+2] == 1)
				location++;
			else {
				location += 2;
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int[] clouds = new int[n+2];
		for(int i=0; i<n; i++) {
			clouds[i] = Integer.parseInt(s[i]);
		}
		System.out.println(numberOfJumps(clouds, n));
	}
}
