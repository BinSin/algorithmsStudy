/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/sam-and-substrings/leaderboard
 */

package algorithmsStudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class SamAndSubstrings {

	public static int mod = (int)(Math.pow(10, 9)) + 7;
	
	public static long substrings(int[] s) {
		long sum = 0;
		int length = s.length;
		long one = 1;
		
		for(int i=0; i<length; i++) {
			sum = (sum + s[length-i-1] * (length-i) * one) % mod;
			
			one = (one * 10 + 1) % mod;
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		
		int[] s = Arrays.stream(n.split("")).mapToInt(Integer::parseInt).toArray();

		System.out.println(substrings(s));
		System.out.println(mod);
	}
}
