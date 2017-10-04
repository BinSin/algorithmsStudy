/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/library-fine
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryFine {

	public static int findCost(int[] a, int[] e) {
		int day = a[0] - e[0];
		int month = a[1] - e[1];
		int year = a[2] - e[2];
	
		if(year > 0) {
			return year * 10000;
		}
		else if(year == 0) {
			if(month > 0) {
				return month * 500;
			}
			else if(month == 0) {
				if(day > 0) {
					return day * 15;
				}
			}
		}
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] s = str.split("\\s+");
		
		String str2 = br.readLine();
		String[] s2 = str2.split("\\s+");
		
		int[] actually = new int[3];
		int[] expected = new int[3];
		
		for(int i=0; i<3; i++) {
			actually[i] = Integer.parseInt(s[i]);
			expected[i] = Integer.parseInt(s2[i]);
		}
		
		System.out.println(findCost(actually, expected));
	}
}
