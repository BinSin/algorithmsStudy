/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/kaprekar-numbers
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ModifiedKaprekarNumbers {

	public static boolean isKaprekarNumber(int i) {
		if(i < 4) {
			if(i == 1)
				return true;
			else {
				return false;
			}
		}
		
		String num = String.valueOf(i);
		BigInteger bn = new BigInteger(num);
		
		BigInteger bnn = bn.multiply(bn);
		String nn = bnn.toString();
		int length = nn.length() / 2;
		
		String frontN = nn.substring(0, length);
		String backN = nn.substring(length);
		int kaprekarN = Integer.parseInt(frontN) + Integer.parseInt(backN);
		
		if(i == kaprekarN)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(br.readLine());
		int q = Integer.parseInt(br.readLine());
		int check = 0;
		
		for(int i=p; i<=q; i++) {
			if(isKaprekarNumber(i)) {
				check = 1;
				System.out.print(i + " ");
			}
		}
		if(check == 0) {
			System.out.println("INVALID RANGE");
		}
	}
}
