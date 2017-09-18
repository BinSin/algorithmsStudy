/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/drawing-book
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawingBook {

	static int solve(int n, int p) {
		int pre_pageNum = n/2 + 1;
		int pageNum = p/2 + 1;
		int turn_pageNum1 = Math.abs(pre_pageNum - pageNum);
		int turn_pageNum2 = pageNum - 1;
		
		int min_turn = Math.min(turn_pageNum1, turn_pageNum2);
		return min_turn;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		int result = solve(n, p);
		System.out.println(result);
	}
}
