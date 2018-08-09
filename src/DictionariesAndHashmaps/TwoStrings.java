/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */

package DictionariesAndHashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TwoStrings {
	
	public static void twoStrings(String s1, String s2) {
		List<Character> l1 = new ArrayList<Character>(s1.length());
		List<Character> l2 = new ArrayList<Character>(s2.length());
		
		for(int i=0; i<s1.length(); i++) {
			l1.add(s1.charAt(i));
		}
		for(int i=0; i<s2.length(); i++) {
			l2.add(s2.charAt(i));
		}
		
		for(int i=0; i<l1.size(); i++) {
			for(int j=0; j<l2.size(); j++) {
				if(l1.get(i) == l2.get(j)) {
					System.out.println("YES");
					return;
				}
			}
			int size = l1.size();
			int sum = 0;
			for(int j=i+1; j<size; j++) {
				if(l1.get(i) == l1.get(j-sum)) {
					l1.remove(j-sum);
					sum++;
				}
			}
			
			l1.remove(i);
		}
		System.out.println("NO");
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int p = Integer.parseInt(br.readLine());
		
		while(p-->0) {
			String s1 = br.readLine();
			String s2 = br.readLine();
			
			twoStrings(s1, s2);
		}
	}
}
