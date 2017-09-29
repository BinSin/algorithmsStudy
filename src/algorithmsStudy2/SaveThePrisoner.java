/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/save-the-prisoner
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveThePrisoner {
	
	public static int saveThePrisoner(int n, int m, int s) {
		int lastDistribute;
		if(m % n == 0) lastDistribute = n;
		else lastDistribute = m % n;
		
		int prisonerNum = s + lastDistribute - 1;
		if(prisonerNum <= n)
			return prisonerNum;
		else
			return prisonerNum - n;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			String str = br.readLine();
			String[] st = str.split("\\s+");
			int n = Integer.parseInt(st[0]);
			int m = Integer.parseInt(st[1]);
			int s = Integer.parseInt(st[2]);
			System.out.println(saveThePrisoner(n, m, s));
		}
	}
}
