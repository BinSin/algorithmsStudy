/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */

package StringManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakingAnagrams {

	private static int makeAnagram(String a, String b) {
		int count = 0;

		StringBuilder asb = new StringBuilder(a);
		StringBuilder bsb = new StringBuilder(b);
		
		for(int i=0; i<asb.length(); i++) {
			for(int j=0; j<bsb.length(); j++) {
				if(asb.charAt(i) == bsb.charAt(j)) {
					asb.deleteCharAt(i);
					bsb.deleteCharAt(j);
					i--;
					j--;
					break;
				}
			}
		}
		
		count = asb.length() + bsb.length();
		
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		
		System.out.println(makeAnagram(a, b));
		
		br.close();
	}
}
