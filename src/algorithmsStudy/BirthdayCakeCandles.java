/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/birthday-cake-candles?h_r=next-challenge&h_v=zen
 */

package algorithmsStudy;

import java.util.Scanner;

public class BirthdayCakeCandles {
	
	static int birthdayCakeCandles(int n, int[] ar) {
		int count = 0;
		int max = ar[0];
		
		for(int i=1; i<n; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(max == ar[i]) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0; i<n; i++) {
			ar[i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
	}
}
