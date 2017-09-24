/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClimbingTheLeaderboard {
	
	public static void setRank(int[] rank, int[] scores) {
		int length = rank.length;
		rank[0] = 1;
		for(int i=1; i<length; i++) {
			if(scores[i] < scores[i-1]) {
				rank[i] = rank[i-1] + 1;
			}
			else {
				rank[i] = rank[i-1];
			}
		}
	}
	
	public static int binarySearch(int[] s, int start, int end, int alice) {
		if(alice<s[end]) return -1;
		if(alice>=s[start]) return 0;
		if(end-start<=1) return end;
		
		int mid = (start+end)/2;
		if(s[mid]<alice) {
			return binarySearch(s,start, mid, alice);
		}
		else if(s[mid] == alice) {
			return mid;
		}
		else {
			return binarySearch(s, mid, end, alice);
		}
	}
	
	/*
	public static void rank(int[] scores, int alice_score) {
		int rank = 1;
		int length = scores.length;
		
		if(scores[0] <= alice_score) {
			rank = 1;
		}
		else {
			for(int i=0; i<length-1; i++) {
				if(alice_score >= scores[i]) break;
				if(scores[i] == scores[i+1]) {
					continue;
				}
				rank++;
			}
			if(scores[length-1] > alice_score) {
				rank++;
			}
		}
		System.out.println(rank);
	}
	*/
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] scores = new int[n];
		String str = br.readLine();
		String[] s = str.split("\\s+");
		
		for(int i=0; i<n; i++) {
			scores[i] = Integer.parseInt(s[i]);
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] alice = new int[m];
		String str2 = br.readLine();
		String[] s2 = str2.split("\\s+");
		
		for(int i=0; i<m; i++) {
			alice[i] = Integer.parseInt(s2[i]);
		}
		
		int[] rank = new int[n];
		setRank(rank, scores);
		
		int start = 0, end = n - 1;
		int ind;
		for(int i=0; i<m; i++) {
			ind = binarySearch(scores, start, end, alice[i]);
			if(ind == -1) {
				System.out.println(rank[n-1]+1);
			}
			else {
				end = ind;
				System.out.println(rank[ind]);
			}
		}
		
		/*
		for(int i=0; i<alice.length; i++) {
			rank(scores, alice[i]);
		}
		*/
	}
}
