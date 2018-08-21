/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */

package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayManipulation {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long[] array = new long[n+1];
		
		while(m-->0) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st2.nextToken());
			int b = Integer.parseInt(st2.nextToken());
			long k = Long.parseLong(st2.nextToken());
			
			array[a-1] += k;
			array[b] -= k;
		}
		br.close();
		
		long sum = 0;
		long max = 0;
		for(int i=0; i<n; i++) {
			sum += array[i];
			max = (sum > max) ? sum : max;
		}
		
		System.out.println(max);
	}
}
