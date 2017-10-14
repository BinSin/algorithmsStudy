/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/bigger-is-greater
 * Time Out TT..
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class BiggerIsGreater {
	
	public static boolean isUpperSort(String s) {
		int length = s.length();
		
		if(length == 1) {
			return true;
		}
		
		char[] c = s.toCharArray();
		Arrays.sort(c);
		
		for(int i=0; i<length; i++) {
			if(c[i] != s.charAt(length-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static int findChangeNum(String last) {
		int length = last.length();
		char[] c = last.toCharArray();
		int big = 1;
		
		for(int i=2; i<length; i++) {
			if(c[0] < c[i] && c[i] < c[big]) {
				big = i;
			}
		}		
		if(big == 1) {
			if(c[0] > c[big])
				return 0;
		}
		return big;
	}
	
	public static String iexicographicallySmallestOne(String w) {
		int length = w.length();
		
		if(length < 2) {
			return "no answer";
		}
		
		else if(length == 2) {
			if(isUpperSort(w)) {
				return "no answer";
			}
			else {
				StringBuilder sb = new StringBuilder(w);
				sb.setCharAt(0, w.charAt(1));
				sb.setCharAt(1, w.charAt(0));
				
				return sb.toString();
			}
		}
		
		String first = w.substring(0, 1);
		String last = w.substring(1);
		
		if(isUpperSort(last)) {
			if(w.charAt(0) > w.charAt(1)) {
				return "no answer";
			}
			else {
				first = "";
				last = w;
			}
		}
		else {
			for(int i=2; i<length-1; i++) {
				first = w.substring(0, i);
				last = w.substring(i);
				if(isUpperSort(last)) {
					first = w.substring(0, i-1);
					last = w.substring(i-1);
					break;
				}
			}

			if(last.length() == 1)  {
				return "no answer";
			}
		}
		
		int changeNum = findChangeNum(last);
		StringBuilder sb = new StringBuilder(last);
		sb.setCharAt(0, last.charAt(changeNum));
		sb.setCharAt(changeNum, last.charAt(0));
		last = sb.toString();
		if(last.length() <= 2) {
			last = sb.toString();
			return first + last;
		}
		else {
			first += sb.substring(0, 1);
			sb.deleteCharAt(0);
			last = sb.toString();
			char[] c = last.toCharArray();
			Arrays.sort(c);
			last = String.valueOf(c);
			return first + last;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String w = br.readLine();
			System.out.println(iexicographicallySmallestOne(w));
		}
	}
}
