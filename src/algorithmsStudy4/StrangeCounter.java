/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/strange-code
 */

package algorithmsStudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrangeCounter {

	public static long conuterValues(long t) {
		long value = 3;
		while(t > value) {
			t = t - value;
			value *= 2;
		}
		return value - t + 1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(br.readLine());
		System.out.println(conuterValues(t));
	}
}
