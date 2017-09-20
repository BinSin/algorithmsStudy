/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/migratory-birds
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MigratoryBirds {
	
	static int migratoryBirds(int n, int[] ar) {
		int count[] = new int[5];
		while(n-->0) {
			count[ar[n]-1]++;
		}
		
		int max_num = 1;
		int max_count = count[0];
		for(int i=1; i<count.length; i++) {
			if(max_count < count[i]) {
				max_count = count[i];
				max_num = i + 1;
			}
		}
		return max_num;
	}
/*
		for(int i=0; i<n; i++) {

 				switch(ar[i]) {
				case 1 : count[0]++; break;
				case 2 : count[1]++; break;
				case 3 : count[2]++; break;
				case 4 : count[3]++; break;
				case 5 : count[4]++; break;
			}
		}
		int max_count = count[0];
		int max_num = 1;
		for(int i=1; i<count.length; i++) {
			if(max_count < count[i]) {
				max_count = count[i];
				max_num = i;
			}
		}
		return 1;
	}
*/
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s");
		int n = Integer.parseInt(s[0]);
		
		int[] ar = new int[n];
		String str2 = br.readLine();
		String[] s2 = str2.split("\\s");
		for(int i=0; i<n; i++) {
			ar[i] = Integer.parseInt(s2[i]);
		}
		int result = migratoryBirds(n, ar);
		System.out.println(result);
		br.close();
	}
}
