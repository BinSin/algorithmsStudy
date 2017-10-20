/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/service-lane
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServiceLane {

	public static int largestVehicle(int[] width, int i, int j) {
		int[] check = new int[4];
		for(int index=i; index<=j; index++) {
				check[width[index]]++; 
		}
		
		if(check[1] > 0)
			return 1;
		else {
			if(check[2] > 0)
				return 2;
			else
				return 3;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int N = Integer.parseInt(s[0]);
		int T = Integer.parseInt(s[1]);
		
		String str2 = br.readLine();
		String[] s2 = str2.split("\\s+");
		int[] width = new int[N];
		for(int i=0; i<N; i++) {
			width[i] = Integer.parseInt(s2[i]);
		}
		
		while(T-->0) {
			String str3 = br.readLine();
			String[] index = str3.split("\\s+");;
			int i = Integer.parseInt(index[0]);
			int j = Integer.parseInt(index[1]);
			System.out.println(largestVehicle(width, i, j));
		}
	}
}
