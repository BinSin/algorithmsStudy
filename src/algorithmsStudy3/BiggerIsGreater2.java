/*
 * Author : deadlycoders
 * https://www.hackerrank.com/challenges/bigger-is-greater
 * challenge again
 */

package algorithmsStudy3;

import java.io.*;

public class BiggerIsGreater2 {
	
	public static void main(String args[])throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s, changeS;
		int n =Integer.parseInt(br.readLine());
		
		while(n-->0) {
			s=br.readLine();
			char[] c = nextPermutation(s.toCharArray());
			changeS = new String(c);
			if(changeS.equals(s)) {
				System.out.println("no answer");
			}
			else {
				System.out.println(c);
			}
		}
	}
	
	public static char[] nextPermutation(char[] array) {
	    // Find non-increasing suffix
	    int i = array.length - 1;
	    while(i > 0 && array[i - 1] >= array[i]) {
	        i--;
	    }
	    
	    if(i <= 0) {
	        return array;
	    }
	
	    // Find successor to pivot
	    int j = array.length - 1;
	    while(array[j] <= array[i - 1]) {
	        j--;
	    }
	    
	    char temp = array[i - 1];
	    array[i - 1] = array[j];
	    array[j] = temp;
	
	    // Reverse suffix
	    j = array.length - 1;
	    while(i < j) {
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	        i++;
	        j--;
	    }
	    return array;
	}
}
