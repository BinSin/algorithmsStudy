/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */

package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoDArrays_DS {
	
	public static int hourglassSum(int[][] arr) {
		int max = 0;
		
		for(int i=0; i<4; i++) {
			int sum = 0;
			for(int j=0; j<4; j++) {
				sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] 
								+ arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				
				if(i == 0 && j == 0)
					max = sum;
				
				if(max < sum)
					max = sum;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[6][6];
		
		
		for(int i=0; i<6; i++) {
			String s = br.readLine();
			arr[i] = Arrays.stream(s.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		}
		
		System.out.println(hourglassSum(arr));
	}
}
