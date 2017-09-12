/*
 * Author : Binsin
 * https://www.hackerrank.com/challenges/grading
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class grading {
	
	static int[] solve(int[] grades) {
		for(int i=0; i<grades.length; i++) {
			if(grades[i] < 38) {
				grades[i] = grades[i];
			}
			else if(grades[i]%10 >= 3 && grades[i]%10 <=5) {
				grades[i] = (grades[i] / 10 * 10) + 5;
			}
			else if(grades[i]%10 >= 8 && grades[i]%10 <=9) {
				grades[i] = (grades[i] / 10 * 10) + 10;
			}
		}
		return grades;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] grades = new int[n];
		for(int grades_i=0; grades_i<n; grades_i++) {
			grades[grades_i] = Integer.parseInt(br.readLine());
		}
		
		int[] result = solve(grades);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + (i != result.length -1 ? "\n" : ""));
		}
		System.out.println("");
	}
}
