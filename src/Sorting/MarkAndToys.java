/*
 * Author: BinSin
 * https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 */

package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MarkAndToys {

	private static int maximumToys(int[] prices, int n, int k) {
		int count = 0;
		int sum = 0;
		int max = n-1;
		
		for(int i=n-1; i>=0; i--) {
			if(prices[i] == k) {
				return 1;
			}
			if(prices[i] < k) {
				max = i;
				break;
			}
		}
		
		for(int i=0; i<=max; i++) {
			sum += prices[i];
			if(sum <= k) {
				count++;
			}
			else {
				break;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] prices = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).sorted().toArray();
		
		System.out.println(maximumToys(prices, n, k));
	}
}
