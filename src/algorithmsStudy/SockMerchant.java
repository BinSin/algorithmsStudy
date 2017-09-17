/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SockMerchant {
	
	static int sockMerchant(int n, int[] ar) {
		int[] socksNum = new int[101];
		int len = socksNum.length;
		for(int i=0; i<n; i++) {
			socksNum[ar[i]]++;
		}
		
		int sum = 0;
		for(int i=0; i<len; i++) {
			sum += socksNum[i] / 2;
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] ar = new int[n];
		
		String str = br.readLine();
		String[] s = str.split("\\s+");
		for(int i=0; i<n; i++) {
			ar[i] = Integer.parseInt(s[i]);
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
	}
}
