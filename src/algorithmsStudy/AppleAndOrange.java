/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/apple-and-orange?h_r=next-challenge&h_v=zen
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppleAndOrange {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static void read(int n, int[] d) throws IOException {
		String str = br.readLine();
		String s[] = str.split("\\s");
		for(int i=0; i<n; i++) {
			d[i] = Integer.parseInt(s[i]);
		}
	}

	static int count(int[] house_position, int fruits_position, int[] position) {
		int count = 0;
		for(int i=0; i<position.length; i++) {
			int p = fruits_position + position[i];
			if(p>=house_position[0] && p<=house_position[1]) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {

		int[] house_position = new int[2];
		int[] fruits_position = new int[2];
		int[] fruits_num = new int[2];

		read(2, house_position);
		read(2, fruits_position);
		read(2, fruits_num);
		
		int[] apples_position = new int[fruits_num[0]];
		int[] orange_position = new int[fruits_num[1]];
		
		read(fruits_num[0], apples_position);
		read(fruits_num[1], orange_position);
		
		int apples_num = count(house_position, fruits_position[0], apples_position);
		int oranges_num = count(house_position, fruits_position[1], orange_position);
	
		System.out.println(apples_num);
		System.out.println(oranges_num);
	}
}
