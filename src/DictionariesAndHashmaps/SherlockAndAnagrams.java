/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */

package DictionariesAndHashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SherlockAndAnagrams {

	private static int sherlockAndAnagrams(String s) {
		int sum = 0;
		
		for(int len=1; len<s.length(); len++) {
			for(int i=0; i+len<s.length(); i++) {
				String first = s.substring(i, i+len);
				char[] c = first.toCharArray();
				Arrays.sort(c);
				first = new String(c);
				
				for(int j=i+1; j+len<=s.length(); j++) {
					String second = s.substring(j, j+len);
					char[] c2 = second.toCharArray();
					Arrays.sort(c2);
					second = new String(c2);
					
					if(first.equals(second)) {
						sum++;
					}
				}
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		
		while(q-->0) {
			String s = br.readLine();
			System.out.println(sherlockAndAnagrams(s));
		}
	}
}
