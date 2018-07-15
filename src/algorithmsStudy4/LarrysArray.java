/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/larrys-array/problem
 */

package algorithmsStudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LarrysArray {

	public static void rotate(int[] A, int n) {
		int temp = A[n];
		for(int i=n; i<n+2; i++) {
			A[i] = A[i+1];
		}
		A[n+2] = temp;
	}
	
	public static boolean check(int[] A) {
		for(int i=0; i<A.length-1; i++) {
			if(A[i+1] != A[i]+1) {
				return false;
			}
		}
		return true;
	}
	
	public static int location(int[] A, int n) {
		for(int i=n-1; i<A.length; i++) {
			if(A[i] == n) {
				return i;
			}
		}
		return A.length;
	}
	
	public static void larrysArray(int[] A, int n) {
		
		for(int i=0; i<n-2; i++) {
			int l = location(A, i+1);
			while(l > i+2) {
				rotate(A, l-2);
				l--;
			}
			if(l == i+2) {
				rotate(A, l-2);
				l--;
			}
			if(l == i+1) {
				rotate(A, l-1);
				l--;
			}
		}
		if(check(A)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			
			String[] str = br.readLine().split("\\s+");
			int[] A = new int[n];
			
			for(int i=0; i<n; i++) {
				A[i] = Integer.parseInt(str[i]);
			}
			
			larrysArray(A, n);
		}
		
		br.close();
	}
}
