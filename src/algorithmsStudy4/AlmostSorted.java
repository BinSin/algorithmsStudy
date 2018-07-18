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
	
	public static void almostSorted(ArrayList<Integer> A, int n) {
		if(n == 2) {
			if(A.get(1) < A.get(0)) {
				System.out.println("yes");
				System.out.println("swap 1 2");
			}
			else {
				System.out.println("yes");
			}
			return;
		}
		
		int count = 0;
		int e1=1, e2=2;
		@SuppressWarnings("unchecked")
		ArrayList<Integer> B = (ArrayList<Integer>)A.clone();
		Collections.sort(B);
		for(int i=0; i<n; i++) {
			if(B.get(i) != A.get(i)) {
				count++;
				if(count == 1) {
					e1 = i+1;
				}
				else if(count == 2) {
					e2 = i+1;
				}
			}
		}
		
		if(count == 0) {
			System.out.println("yes");
			return;
		}
		else if(count == 2) {
			System.out.println("yes");
			System.out.println("swap " + e1 + " " + e2);
			return;
		}

		int gap = 0, rev = 0;
		int start = 1, end = 2;
		for(int i=0; i<n-1; i++) {
			if(A.get(i) >= A.get(i+1)) {
				gap++;
				if(gap == 1)
					start = i+1;
				else if(gap > 1)
					end = i+2;
			}
			else {
				if(gap >= 2) {
					System.out.println("yes");
					System.out.println("reverse " + start + " " + end);
					return;
				}
				if(gap == 1) {
					rev++;
				}
				if(rev > 1) {
					System.out.println("no");
					return;
				}
				gap = 0;
			}
		}
		if(gap >= 2) {
			System.out.println("yes");
			System.out.println("reverse " + start + " " + n);
		}
		else {
			System.out.println("no");
		}
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
