/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/organizing-containers-of-balls
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class OrganizingContainersOfBalls {

	public static void swapTwoBalls(int[] c, int[] t, int q) {
		// Arrays.sort : 배열 정렬
		// Array.equals : 배열 비교
		Arrays.sort(c);
		Arrays.sort(t);
		if(Arrays.equals(c, t)) {
			System.out.println("Possible");
		}
		else {
			System.out.println("Impossible");
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n-->0) {
			int q = Integer.parseInt(br.readLine());
			int[] containersOfSum = new int[q];
			int[] typesOfSum = new int[q];
			for(int i=0; i<q; i++) {
				String str = br.readLine();
				String[] s = str.split("\\s+");
				for(int j=0; j<q; j++) {
					containersOfSum[i] += Integer.parseInt(s[j]);
					typesOfSum[j] += Integer.parseInt(s[j]);
				}
			}
			swapTwoBalls(containersOfSum, typesOfSum, q);
		}
	}
}
