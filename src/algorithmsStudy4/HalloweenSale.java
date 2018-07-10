/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/halloween-sale/problem
 */

package algorithmsStudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HalloweenSale {

	public static int howManyGames(int p, int d, int m, int s) {
		
		int sum = 0;
		int num = p;
		int count = -1;
		
		while(sum <= s) {
			sum += num;
			num -= d;
			if(num < m)
				num = m;
			count++;
		}
		
		return count;
	}
	
 	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		String str[] = st.split("\\s+");
		
		int p = Integer.parseInt(str[0]);
		int d = Integer.parseInt(str[1]);
		int m = Integer.parseInt(str[2]);
		int s = Integer.parseInt(str[3]);
		
		int answer = howManyGames(p, d, m, s);
		
		System.out.println(answer);
		
		br.close();
	}
}
