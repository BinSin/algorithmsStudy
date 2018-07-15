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
		for(int i=n; i<n+3; i++) {
			A[i] = A[i+1];
		}
		A[n+2] = temp;
	}
	
	public static boolean check(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			if(a[i+1] != a[i]+1) {
				return false;
			}
		}
		return true;
	}
	
	public static int location(int[] A, int n) {
		for(int i=n-1; i<A.length; i++) {
			if(i == n-1)
				return i;
		}
	
	public static boolean larrysArray(int[] A, int n) {
		
		for(int i=0; i<n-2; i++) {
			int num = 0;
			for(int j=i; j<n; j++) {
				if(A[j] == i+1) {
					num = j;
					break;
				}
			}
			
		}
		
			
			int[] a = new int[3];
			for(int j=0; j<3; i++) {
				a[j] = A[j];
			}
			if(check(a))
				
			if(A[i] != i+1) {
				
			}
		}
		
		return true;
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
			
			System.out.println(larrysArray(A, n));
		}
	}
}
