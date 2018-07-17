/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/almost-sorted/problem
 */

package algorithmsStudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class AlmostSorted {

	public static boolean checkSort(ArrayList<Integer> A) {
		@SuppressWarnings("unchecked")
		ArrayList<Integer> B = (ArrayList<Integer>)A.clone();
		Collections.sort(B);
		if(A.equals(B)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void swap(ArrayList<Integer> A, int a, int b) {
		int atmp = A.get(a);
		int btmp = A.get(b);
		A.set(a, btmp);
		A.set(b, atmp);
	}
	
	public static boolean checkReverse(ArrayList<Integer> A, int a, int b) {
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		for(int i=a; i<=b; i++) {
			B.add(A.get(i));
		}
		
		@SuppressWarnings("unchecked")
		ArrayList<Integer> C = (ArrayList<Integer>)B.clone();
		Collections.sort(C);
		Collections.reverse(C);
		if(B.equals(C)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int[] compare(ArrayList<Integer> A, int n) {
		int count = 0;
		int t = 0;
		int[] num = new int[2];
		for(int i=0; i<n-1; i++) {
			if(A.get(i+1) < A.get(i)) {
				count++;
				t = i+1;
				num[0] = A.get(i+1);
				break;
			}
		}
		
		if(count == 0) return null;
		
		for(int i=t; i<n-1; i++) {
			if(A.get(i+1) < A.get(i)) {
				count++;
				t = i+1;
				num[1] = A.get(i+1);
				break;
			}
		}
		
		for(int i=t; i<n-1; i++) {
			if(A.get(i+1) < A.get(i)) {
				return null;
			}
		}
		
		return num;
	}
	
	public static void almostSorted(ArrayList<Integer> A, int n) {
		if(checkSort(A)) {
			System.out.println("yes");
			return;
		}
		
		int[] num = compare(A, n);
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				@SuppressWarnings("unchecked")
				ArrayList<Integer> tmp = (ArrayList<Integer>)A.clone();
				swap(tmp, i, j);
				if(checkSort(tmp)) {
					System.out.println("yes");
					System.out.println("swap " + (i+1) + " " + (j+1));
					return;
				}
			}
		}
		
		int t = 1;
		for(int i=n-1; i>2; i--) {
			for(int j=0; j<t; j++) {
				if(checkReverse(A, j, i)) {
					System.out.println("yes");
					System.out.println("reverse " + (j+1) + " " + (i+1));
					return;
				}
			}
			t++;
		}
		System.out.println("no");
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		String[] s = str.split("\\s+");
		
		ArrayList<Integer> A = new ArrayList<Integer>(n);
		for(int i=0; i<n; i++) {
			A.add(Integer.parseInt(s[i]));
		}

		almostSorted(A, n);
		
		br.close();
	}
}
