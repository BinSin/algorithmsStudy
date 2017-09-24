/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/designer-pdf-viewer?h_r=next-challenge&h_v=zen
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DesignerPDFViewer {
	// 'a' => 97
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s+");
		
		int[] heights = new int[26];
		for(int i=0; i<26; i++) {
			heights[i] = Integer.parseInt(s[i]);
		}
		
		String str2 = br.readLine();
		char[] c = str2.toCharArray();
		
		int word_length = str2.length();
		int[] each_word_heights = new int[word_length];
		for(int i=0; i<word_length; i++) {
			each_word_heights[i] = heights[(int)c[i]-97];
		}
		
		int max = each_word_heights[0];
		for(int i=1; i<word_length; i++) {
			if(max < each_word_heights[i])
				max = each_word_heights[i];
		}
		
		System.out.println(max * word_length);
	}
}
