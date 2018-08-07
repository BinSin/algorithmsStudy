/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/ctci-ransom-note/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */

package DictionariesAndHashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.StringTokenizer;

public class HashTables_RansomNote {

	private static void checkMagazine(List<String> magazine, List<String> note) {	
		int noteSize = note.size();
		
		while(noteSize-->0) {
			for(int i=0; i<magazine.size(); i++) {
				if((note.get(noteSize)).equals(magazine.get(i))) {
					
					note.remove(noteSize);
					magazine.remove(i);
					
					if(note.size() == 0) {
						System.out.println("Yes");
						return;
					}
					break;
				}
			}
			if(noteSize != note.size())
				break;
		}
		
		System.out.println("No");
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
	
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		List<String> magazine = new ArrayList<String>(m);
		while(st2.hasMoreTokens()) {
			magazine.add(st2.nextToken());
		}
		
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		List<String> note = new ArrayList<String>(n);
		while(st3.hasMoreTokens()) {
			note.add(st3.nextToken());
		}
		
		checkMagazine(magazine, note);
	}
}
