/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/sherlock-and-squares
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SherlockAndSquares {
	
	public static int countSquareNumber(int[] n) {
		int count = 0;
		for(int i=(int)Math.ceil(Math.sqrt(n[0])); i<=(int)Math.sqrt(n[1]); i++) {
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			String str = br.readLine();
			String[] s = str.split("\\s+");
			int[] number = new int[2];
			for(int i=0; i<2; i++)
				number[i] = Integer.parseInt(s[i]);
			System.out.println(countSquareNumber(number));
		}
	}
}
