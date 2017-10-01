/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/extra-long-factorials
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ExtraLongFactorials {
	
	public static BigInteger bigFactorial(int num) {
		if(num == 1) return BigInteger.ONE;
		return bigFactorial(num-1).multiply(BigInteger.valueOf(num));
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(bigFactorial(num).toString());
	}
}
