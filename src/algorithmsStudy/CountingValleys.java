/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/counting-valleys
 */
package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {

	public static int countValley(char[] c) {
		int length = c.length;
		int seaLevel = 0;
		int vallyNumber = 0;
		
		for(int i=0; i<length; i++) {
			if(c[i] == 'U') {
				seaLevel++;
				if(seaLevel == 0)
					vallyNumber++;
			}
			else {
				seaLevel--;
			}
		}
		return vallyNumber;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		char[] c = new char[n];
		for(int i=0; i<n; i++) {
			c[i] = str.charAt(i);
		}
		
		System.out.println(countValley(c));
	}
}
