/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/angry-professor
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AngryProfessor {

	public static void cancelClass(int[] time, int pass) {
		int lateStudentNum = 0;
		int studentNum = time.length;
		for(int i=0; i<studentNum; i++) {
			if(time[i] > 0) lateStudentNum++;
		}
		System.out.println((studentNum-lateStudentNum<pass) ?  "YES" : "NO");
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int classNum = Integer.parseInt(br.readLine());
		
		while(classNum-- > 0) {
			String str = br.readLine();
			String[] s = str.split("\\s+");
			int studentNum = Integer.parseInt(s[0]);
			int passNum = Integer.parseInt(s[1]);
			int[] studentsTime = new int[studentNum];
			
			String str2 = br.readLine();
			String[] s2 = str2.split("\\s+");
			for(int i=0; i<studentNum; i++) {
				studentsTime[i] = Integer.parseInt(s2[i]);
			}
			cancelClass(studentsTime, passNum);
		}
	}
}