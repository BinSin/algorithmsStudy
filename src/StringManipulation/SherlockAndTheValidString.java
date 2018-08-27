/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */

package StringManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;

public class SherlockAndTheValidString {

	private static boolean isValid(String s) {
		Hashtable<Character, Integer> map = new Hashtable<Character, Integer>();
		
		for(int i=0; i<s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		Enumeration<Character> e = map.keys();
		
		int max = map.get(e.nextElement());
		int min = max;
		int maxCheck = 0;
		int minCheck = 0;
		while(e.hasMoreElements()) {
			int next = map.get(e.nextElement());
			if(next > max) {
				maxCheck++;
				max = next;
			}
			if(next < min) {
				minCheck++;
				min = next;
			}
		}

		if(max == min) {
			return true;
		}
		if(maxCheck > 1 || minCheck > 1) {
			return false;
		}
		
		e = map.keys();
		int maxCount = 0;
		int minCount = 0;
		int count = 0;
		while(e.hasMoreElements()) {
			count++;
			int next = map.get(e.nextElement());
			if(next == max)
				maxCount++;
			if(next == min)
				minCount++;
		}
		
		if(count == maxCount + minCount) {
			if(maxCount > 1) {
				if(minCount == 1) {
					if(min == 1)
						return true;
					else
						return false;
				}
				else {
					return false;
				}
			}
			else if(maxCount == 1) {
				if(max - min == 1)
					return true;
				else
					return false;
			}
			else {
				return false;
			}
		}
		else 
			return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		if(isValid(s)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
