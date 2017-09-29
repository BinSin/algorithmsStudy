/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/circular-array-rotation
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircularArrayRotation {
	
	public static int circularRotate(int[] array, int m, int index) {
		int length = array.length;
		int rotateNum = m % length;
		int realIndex = length - rotateNum + index;
		if(rotateNum == 0)
			return array[index];
		
		if(realIndex < length)
			return array[realIndex];
		else
			return array[realIndex - length];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int k = Integer.parseInt(s[2]);
		
		int[] array = new int[n];
		String str2 = br.readLine();
		String[] s2 = str2.split("\\s+");
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(s2[i]);
		}
		
		for(int i=0; i<k; i++) {
			int index = Integer.parseInt(br.readLine());
			System.out.println(circularRotate(array, m, index));
		}
	}
}
