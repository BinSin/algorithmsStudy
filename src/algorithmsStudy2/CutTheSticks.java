/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/cut-the-sticks
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CutTheSticks {

	public static int findMinStick(int[] s, int length) {
		int min = 0;
		for(int i=0; i<length; i++) {
			if(s[i] > 0) {
				min = s[i];
				break;
			}
		}
		
		if(min == 0) return 0;
		
		for(int i=0; i<length; i++) {
			if(s[i] > 0) {
				if(min > s[i]) {
					min = s[i];
				}
			}
		}
		return min;
	}
	
	public static int countSticks(int[] s, int length) {
		int count = 0;
		for(int i=0; i<length; i++) {
			if(s[i] > 0) count++;
		}
		return count;
	}
	
	public static void numberOfSticks(int[] s, int length) {
		int min = 0;
		while((min = findMinStick(s, length)) > 0) {
			System.out.println(countSticks(s, length));
			for(int i=0; i<length; i++) {
				s[i] -= min;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int[] sticks = new int[n];
		for(int i=0; i<n; i++) {
			sticks[i] = Integer.parseInt(s[i]);
		}
		numberOfSticks(sticks, n);
	}
}
