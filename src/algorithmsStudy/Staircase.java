/*
 * Author : Binsin
 * https://www.hackerrank.com/challenges/staircase
 */
package algorithmsStudy;

import java.io.*;

public class Staircase {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		int size = s;
		
		while(size-->0) {
			for(int i=0; i<size; i++) {
				System.out.print(" ");
			}
			for(int i=0; i<s-size; i++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
