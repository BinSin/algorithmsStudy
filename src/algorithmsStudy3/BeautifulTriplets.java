/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/beautiful-triplets
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulTriplets {

	public static int countTriplet(int[] a, int d) {
		int length = a.length;
		int count = 0;
		for(int i=0; i<length-2; i++) {
			for(int j=i+1; j<length-1; j++) {
				if(a[j] - a[i] == d) {
					for(int k=j+1; k<length; k++) {
						if(a[k] - a[j] == d) {
							count++;
						}
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int n = Integer.parseInt(s[0]);
		int d = Integer.parseInt(s[1]);
		int[] a = new int[n];
		
		String str2 = br.readLine();
		String[] s2 = str2.split("\\s+");
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(s2[i]);
		}
		System.out.println(countTriplet(a, d));
	}
}
