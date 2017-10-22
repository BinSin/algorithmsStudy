/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/flatland-space-stations
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FlatlandSpaceStations {

	public static int maxDistance(int[] distance, int n, int m) {
		Arrays.sort(distance);
		int max;
		if(distance[0] < n - distance[m-1] -1) 
			max = n - distance[m-1] -1;
		else
			max = distance[0];
		
		for(int i=0; i<m-1; i++) {
			if(max < (distance[i+1] - distance[i]) / 2) {
				max = (distance[i+1] - distance[i]) / 2;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		String str2 = br.readLine();
		String[] s2 = str2.split("\\s+");
		int[] distance = new int[m];
		for(int i=0; i<m; i++) {
			distance[i] = Integer.parseInt(s2[i]);
		}
		System.out.println(maxDistance(distance, n, m));
	}
}