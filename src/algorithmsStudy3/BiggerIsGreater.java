/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/bigger-is-greater
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BiggerIsGreater {
	
	public static int findNextHighElement(String w) {
		int length = w.length();
		int bigger = 0;
		for(int i=1; i<length; i++) {
			if(w.charAt(0) < w.charAt(i)) {
				bigger = i;
				break;
			}
		}
		if(bigger == 0) return 0;
		
		for(int i=2; i<length; i++) {
			if(w.charAt(0) < w.charAt(i) && w.charAt(i) < w.charAt(bigger)) {
				bigger = i;
			}
		}
		return bigger;
	}
	
	public static String iexicographicallySmallestOne(String w) {
		int length = w.length();
		StringBuilder sb = new StringBuilder(w);
		int check = 0;
		
		int first = 0;
		int change = 0;
		
		if(length >= 2) {
			for(int i=length-1; i>1; i--) {
				for(int j=i-1; j>=1; j--) {
					if(w.charAt(i) > w.charAt(j)) {
						first = i;
						change = j;
						check = 1;
						break;
					}
				}
			}
			if(check != 1) {
				first = findNextHighElement(w);
				change = 0;
				check = 1;
			}
		}
		else {
			return "no answer";
		}
		
		if(check != 1) {
			return "no answer";
		}
		
		sb.setCharAt(change, w.charAt(first));
		sb.setCharAt(first, w.charAt(change));
		
		String str = sb.substring(0, first+1);
		String finalStr = sb.substring(first+1);
		
		char[] sortStr = finalStr.toCharArray();
		Arrays.sort(sortStr);
		String sortString = String.valueOf(sortStr);
		
		str = str.concat(sortString);
		return str;
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
