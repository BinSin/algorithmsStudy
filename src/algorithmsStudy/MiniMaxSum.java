/*
 * Author : Binsin
 * https://www.hackerrank.com/challenges/mini-max-sum?h_r=next-challenge&h_v=zen
 */

package algorithmsStudy;

import java.io.*;
import java.util.Scanner;

public class MiniMaxSum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String s[] = str.split("\\s");
		
		long sum = 0;
		long min, max;
		long[] arr = new long[5];
		for(int i=0; i<5; i++) {
			arr[i] = Long.parseLong(s[i]);
			sum += arr[i];
		}
		
		
/*		
  		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		
		
		for(int i=0; i<5; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
*/		
		max = arr[0];
		min = arr[0];
		
		for(int i=1; i<5; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.print(sum - max);
		System.out.print(" ");
		System.out.println(sum - min);
	}
}
