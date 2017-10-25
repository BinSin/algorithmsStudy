/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/manasa-and-stones
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManasaAndStones {

	public static void numberOfValueOfLastStone(int n, int a, int b) {
		int lastStoneValue = 0;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		int pre = 0;
		
		for(int i=0; i<n; i++) {  
			lastStoneValue = min * (n-i-1) + max * i;
            if(lastStoneValue == pre)
                continue;
            pre = lastStoneValue;
			System.out.print(lastStoneValue + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			int n = Integer.parseInt(br.readLine());
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			numberOfValueOfLastStone(n, a, b);
		}	
	}
}
