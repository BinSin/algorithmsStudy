/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/almost-sorted/problem
 */

package algorithmsStudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlmostSorted {
	
	public static void reverse(int[] A, int start, int end) {
		while(start < end) {
			swap(A, start, end);
			start++;
			end--;
		}
	}
	
	public static void swap(int[] A, int start, int end) {
		int temp;
		temp = A[start];
		A[start] = A[end];
		A[end] = temp;
	}
	
	public static boolean isSort(int[] A, int n) {
		for(int i=0; i<n-1; i++) {
			if(A[i] > A[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void almostSorted(int[] A, int n) {
		if(isSort(A, n)) {
			System.out.println("yes");
			return;
		}
		
		int i, j;
		for(i=0; i<n-1 && A[i] < A[i+1]; i++);
		for(j=n-1; j>0 && A[j-1] < A[j]; j--);
		
		swap(A, i, j);
		
		if(isSort(A, n)) {
			System.out.println("yes");
			System.out.println("swap " + (i+1) + " " + (j+1));
			return;
		}
		
		reverse(A, i+1, j-1);
		
		if(isSort(A, n)) {
			System.out.println("yes");
			System.out.println("reverse " + (i+1) + " " + (j+1));
		}
		else {
			System.out.println("no");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int i =0;
		int[] A = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int t = Integer.parseInt(st.nextToken());
			A[i++] = t;
		}
		
		almostSorted(A, n);
		
		br.close();
	}
}
