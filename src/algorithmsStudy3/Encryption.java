/*
 * Author : BinSin
 * https://www.hackerrank.com/domains/algorithms/implementation?filters=status%3Aunsolved
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encryption {

	public static void changeText(String str) {
		int L = str.length();
		int sqrtL = (int)Math.ceil((Math.sqrt(L)));
		int row = sqrtL;
		int column = sqrtL;
			
		if((row-1) * column >= L) {
			row--;
		}
		
		for(int i=0; i<column; i++) {
			for(int j=i; j<L; j+=column) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		changeText(str);		
	}
}
