/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/strange-advertising
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViralAdvertising {

	public static int floor(int day) {
		int shareNum = 0;
		int peopleNum = 5;
		int like_peopleNum = peopleNum / 2;
		
		for(int i=0; i<day; i++) {
			shareNum += like_peopleNum;
			peopleNum = 3 * like_peopleNum;
			like_peopleNum = peopleNum / 2;
		}
		return shareNum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int day = Integer.parseInt(br.readLine());
		System.out.println(floor(day));
	}
}
