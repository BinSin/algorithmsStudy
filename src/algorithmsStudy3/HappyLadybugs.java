/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/happy-ladybugs
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HappyLadybugs {

	public static String LadybugsHappy(int n, String b) {
		char[] c = b.toCharArray();
		if(n == 1) {
			if(c[0] == '_')
				return "YES";
			else
				return "NO";
		}
		int check1 = 0;
		for(int i=0; i<n; i++) {
			if(c[i] == '_') {
				check1 = 1;
				break;
			}
		}
		
		int check2 = 1;
		if(check1 == 0) {
			for(int i=0; i<n; i+=check2) {
				int c2 = 0;
				for(int j=i+1; j<n && c[i] == c[j]; j++) {
					c2++;
				}
				if(c2 == 0)
					return "NO";
				check2 = c2 + 1;
			}
			return "YES";
		}
		else {
			char[] counts = new char[256];
			for(int i=0; i<n; i++) {
				counts[c[i]]++;
			}
			for(int i=0; i<256; i++) {
				if(i != '_' && counts[i] == 1)
					return "NO";
			}
			return "YES";
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			int n = Integer.parseInt(br.readLine());
			String b = br.readLine();
			System.out.println(LadybugsHappy(n, b));
		}
	}
}