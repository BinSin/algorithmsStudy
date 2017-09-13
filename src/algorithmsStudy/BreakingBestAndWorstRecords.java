/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakingBestAndWorstRecords {

	static int[] getRecord(int[] s) {
		int best_record = s[0];
		int worst_record = s[0];
		int best_count = 0;
		int worst_count = 0;
		int[] count = new int[2];
		
		for(int i_s=1; i_s<s.length; i_s++) {
			if(best_record < s[i_s]) {
				best_count++;
				best_record = s[i_s];
			}
			if(worst_record > s[i_s]) {
				worst_count++;
				worst_record = s[i_s];
			}
		}
		count[0] = best_count;
		count[1] = worst_count;
		
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		String st[] = str.split("\\s");
		int[] s = new int[n];
		for(int s_i=0; s_i<s.length; s_i++) {
			s[s_i] = Integer.parseInt(st[s_i]);
		}
		int[] result = getRecord(s);
		String separator = "", delimiter = " ";
		for(Integer val : result) {
			System.out.print(separator + val);
			separator = delimiter;
		}
		System.out.println("");
	}
}
