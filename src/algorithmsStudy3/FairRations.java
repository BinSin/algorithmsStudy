/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/fair-rations
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FairRations {

	public static void minimunNumberOfLoaves(int[] b, int n) {
		int eachNumber = 0;
		int check = 0;
		int numberOfLoaves = 0;
		
		for(int i=0; i<n; i++) {
			if(b[i] == 1) {
				eachNumber++;
				check++;
			}
			if(check % 2 == 1)
				numberOfLoaves+=2;
		}
		
		if(eachNumber % 2 == 1) {
			System.out.println("NO");
		}
		else {
			System.out.println(numberOfLoaves);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] b = new int[n];
		String str = br.readLine();
		String[] s = str.split("\\s+");
		for(int i=0; i<n; i++) {
			b[i] = Integer.parseInt(s[i]) % 2;
		}
		minimunNumberOfLoaves(b, n);
	}
}
