/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/repeated-string
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedString {
	
	public static long countFirstChar(String s, long n) {

		long length = (long)s.length();
		long lastlength = n % length;
		long count =0;
		long lastcount = 0;
		
		for(int i=0; i<length; i++) {
			if('a' == s.charAt(i)) 
				count++;
		}
		
		if(lastlength == 0) {
			return count * (n / length);
		}
		else {
			for(int i=0; i<lastlength; i++) {
				if('a' == s.charAt(i)) 
					lastcount++;
			}
			return count * (n / length) + lastcount;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long n = Long.parseLong(br.readLine());
		
		System.out.println(countFirstChar(str, n));
	}
}
