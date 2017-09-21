/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/electronics-shop
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectronicsShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int s) {
		int maxSpent = -1;
		int keyboards_num = keyboards.length;
		int drives_num = drives.length;
		
		for(int i=0; i<keyboards_num; i++) {
			for(int j=0; j<drives_num; j++) {
				if(keyboards[i]+drives[j] <= s && 
						keyboards[i]+drives[j] > maxSpent) {
					maxSpent = keyboards[i]+drives[j];
				}
			}
		}
		
		return  maxSpent;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] st = str.split("\\s+");
		
		int s = Integer.parseInt(st[0]);
		int n = Integer.parseInt(st[1]);
		int m = Integer.parseInt(st[2]);
		int[] keyboards = new int[n];
		
		String str2 = br.readLine();
		String[] st2 = str2.split("\\s+");
		for(int i=0; i<n; i++) {
			keyboards[i] = Integer.parseInt(st2[i]);
		}
		
		int[] drives = new int[m];
		String str3 = br.readLine();
		String[] st3 = str3.split("\\s");
		for(int i=0; i<m; i++) {
			drives[i] = Integer.parseInt(st3[i]);
		}
		
		int moneySpent = getMoneySpent(keyboards, drives, s);
		System.out.println(moneySpent);
	}
}
