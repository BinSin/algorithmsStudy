/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/utopian-tree
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UtopianTree {
	
	public static void height(int[] cycle) {
		int length = cycle.length;
		for(int i=0; i<length; i++) {
			int height = 1;
			for(int j=1; j<=cycle[i]; j++) {
				if(j%2 == 0)
					height += 1;
				else
					height *= 2;
			}
			System.out.println(height);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] cycle = new int[n];
		for(int i=0; i<n; i++) {
			cycle[i] = Integer.parseInt(br.readLine());
		}
		height(cycle);
	}
}
