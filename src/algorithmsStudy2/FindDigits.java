/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/find-digits
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDigits {

	public static int countDigits(int num) {
		String s = num + "";
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)-48 == 0) continue;
			if(num % (s.charAt(i)-48)== 0) count++;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n-->0) {
			int num = Integer.parseInt(br.readLine());
			System.out.println(countDigits(num));
		}
	}
}
