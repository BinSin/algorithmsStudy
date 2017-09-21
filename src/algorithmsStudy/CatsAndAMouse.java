/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */

package algorithmsStudy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CatsAndAMouse {

	public static void whoCatch(int[] dis) {
		int A_mouse = Math.abs(dis[0]-dis[2]);
		int B_mouse = Math.abs(dis[1]-dis[2]);
		if(A_mouse < B_mouse) {
			System.out.println("Cat A");
		}
		else if(A_mouse > B_mouse) {
			System.out.println("Cat B");
		}
		else {
			System.out.println("Mouse C");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		
		String[] str = new String[q];
		for(int i=0; i<q; i++) {
			str[i] = br.readLine();
		}
		
		for(int i=0; i<q; i++) {
			String s = str[i];
			String[] s2 = s.split("\\s+");
			int[] n = new int[3];
			for(int j=0; j<3; j++) {
				n[j] = Integer.parseInt(s2[j]);
			}
			whoCatch(n);
		}
	}
}