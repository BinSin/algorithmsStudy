/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BonAppetit {
	
	static int bonAppetit(int n, int k, int b, int[] ar) {
		int bonCost = 0;
		int give = 0;
		for(int a : ar) {
			bonCost += a;
		}
		bonCost -= ar[k];
		bonCost /= 2;
		
		if(bonCost == b) {
			return -1;
		}
		
		bonCost += ar[k];
		if(bonCost > b) {
			give = bonCost - b;
		}
		return give;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		
		String str2= br.readLine();
		String[] s2 = str2.split("\\s");
		int[] ar = new int[n];
		for(int i=0; i<n; i++) {
			ar[i] = Integer.parseInt(s2[i]);
		}
		int b = Integer.parseInt(br.readLine());
		int result = bonAppetit(n, k, b, ar);
		System.out.println((result<0) ? "Bon Appetit" : result);
	}
}
