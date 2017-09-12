/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/between-two-sets
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BetweenTwoSets {

	static int findMax(int[] c) {
		int max = c[0];
		if(c.length == 1) return max;
		
		for(int i=1; i<c.length; i++) {
			if(max < c[i]) {
				max = c[i];
			}
		}
		return max;
	}
	
	static int findMin(int[] c) {
		int min = c[0];
		if(c.length == 1) return min;
		
		for(int i=1; i<c.length; i++) {
			if(min > c[i]) {
				min = c[i];
			}
		}
		return min;
	}
	
	static boolean isMultiple(int n, int[] c) {
		for(int i=0; i<c.length; i++) {
			if(n%c[i] != 0) return false;
		}
		return true;
	}
	
	static boolean isDivisor(int n, int[] c) {
		for(int i=0; i<c.length; i++) {
			if(c[i]%n != 0) return false; 
		}
		return true;
	}
	
	static int getTotalX(int[] a, int[] b) {
		int num = findMax(a);
		int count = 0;
		
		for(int i=0; i<findMin(b)/findMax(a); i++) {
			if(isDivisor(num, b) && isMultiple(num, a)) {
				count++;
			}
			num += findMax(a);
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String s[] = str.split("\\s");
		
		int n = Integer.parseInt(s[0]); 
		int m = Integer.parseInt(s[1]);
		
		int[] a = new int[n];
		String str1 = br.readLine();
		String s1[] = str1.split("\\s");
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(s1[i]);
		}

		int[] b = new int[m];
		String str2 = br.readLine();
		String s2[] = str2.split("\\s");
		for(int i=0; i<m; i++) {
			b[i] = Integer.parseInt(s2[i]);
		}

		int total = getTotalX(a, b);
		System.out.println(total);
		br.close();
	}
}
