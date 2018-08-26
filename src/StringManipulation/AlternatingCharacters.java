/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */

package StringManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternatingCharacters {

	private static int alternatingCharacters(String s) {
		int count = 0;
		for(int i=0; i<s.length()-1; i++) {
			if(Math.abs(s.charAt(i) - s.charAt(i+1)) == 0)
				count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		
		while(q-->0) {
			String s = br.readLine();
			System.out.println(alternatingCharacters(s));
		}
	}
}
