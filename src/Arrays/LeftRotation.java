/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */

package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LeftRotation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] str = s.split("\\s+");
		
		int n = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		String s2 = br.readLine();
		int[] arr = Arrays.stream(s2.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		int[] rotateArr = new int[n];		
		b %= n;
		for(int i=0; i<n; i++) {
			rotateArr[(n-b+i)%n] = arr[i];
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(rotateArr[i] + " ");
		}
	}
}
