/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/picking-numbers
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PickingNumbers {

	
	public static int max_num_array(int[] n) {
		int length = 100;
		
		int[] count = new int[length];
		for(int i=0; i<n.length; i++) {
			count[n[i]]++;
		}
		
		int max = 0;
		for(int i=0; i<length-1; i++) {
			max = Math.max(max, count[i] + count[i+1]);
		}
		return max;
	}

	/*
	public static int max_num_array(int[] n) {
		int length = n.length;
		int max_count = 0;

		for (int i = 0; i < length; i++) {
			int max1 = 0;
			int max2 = 0;
			for (int j = 0; j < length; j++) {
				if ((n[j] == n[i] + 1) || (n[j] == n[i])) {
					max1++;
				}
				if ((n[j] == n[i] - 1) || (n[j] == n[i])) {
					max2++;
				}
			}
			if ((max_count < max1) || (max_count < max2)) {
				max_count = (max1 >= max2) ? max1 : max2;
			}
		}
		return max_count;
	}
	 */
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int str = Integer.parseInt(br.readLine());
		String str2 = br.readLine();
		String s2[] = str2.split("\\s+");
		int[] num = new int[str];
		for (int i = 0; i < str; i++) {
			num[i] = Integer.parseInt(s2[i]);
		}
		System.out.println(max_num_array(num));
	}
}
