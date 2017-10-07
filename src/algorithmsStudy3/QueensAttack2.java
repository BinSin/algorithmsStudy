/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/queens-attack-2?h_r=next-challenge&h_v=zen
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueensAttack2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int boardLength = Integer.parseInt(s[0]);
		int obstacleNum = Integer.parseInt(s[1]);
		
		String str2 = br.readLine();
		String[] s2 = str2.split("\\s+");
		int queenRow = Integer.parseInt(s2[0]);
		int queenCol = Integer.parseInt(s2[1]);
		
		int up, left, right, down, ul, ur, dl, dr;
		
		up = boardLength - queenRow;
		down = queenRow - 1;
		left = queenCol -1;
		right = boardLength - queenCol;
		ul = up<left?up:left;
		ur = up<right?up:right;
		dl = down<left?down:left;
		dr = down<right?down:right;
		
		while(obstacleNum-->0) {
			String str3= br.readLine();
			String[] s3 = str3.split("\\s+");
			int obstacleRow = Integer.parseInt(s3[0]);
			int obstacleCol = Integer.parseInt(s3[1]);
			
			if(obstacleCol == queenCol) {
				int path = Math.abs(obstacleRow-queenRow) - 1;
				if(obstacleRow < queenRow) {
					down = down<path?down:path;
				}
				else {
					up = up<path?up:path;
				}
			}
			else if(obstacleRow == queenRow) {
				int path = Math.abs(obstacleCol-queenCol) - 1;
				if(obstacleCol < queenCol) {
					left = left<path?left:path;
				}
				else {
					right = right<path?right:path;
				}
			}
			else {
				int pathRow = Math.abs(obstacleRow-queenRow) - 1;
				int pathCol = Math.abs(obstacleCol-queenCol) - 1;
				
				if(pathRow == pathCol) {
					if((obstacleRow < queenRow) && (obstacleCol < queenCol))
						dl = dl<pathRow?dl:pathRow;
					else if((obstacleRow < queenRow) && (obstacleCol > queenCol))
						dr = dr<pathRow?dr:pathRow;
					else if((obstacleRow > queenRow) && (obstacleCol < queenCol))
						ul = ul<pathRow?ul:pathRow;
					else
						ur = ur<pathRow?ur:pathRow;
				}
			}
		}
		int total = up + left + right + down + dl + dr + ul + ur;
		System.out.println(total);
	}
}
