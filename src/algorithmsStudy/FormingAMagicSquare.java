/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/magic-square-forming
 */

package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// n * n Magic Square
// 값은 1 ~ n^2 까지
// 각 행, 열의 합 = n(n^2 + 1) / 2
public class FormingAMagicSquare {

	public static int costValue(int[][] compare, int[][] magic) {
		int cost = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				cost += Math.abs(compare[i][j] - magic[i][j]);
			}
		}
		return cost;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] matrix = new int[3][3];
		
		int[][] magic_square1 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
		int[][] magic_square2 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
		int[][] magic_square3 = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
		int[][] magic_square4 = {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}};
		int[][] magic_square5 = {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};
		int[][] magic_square6 = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
		int[][] magic_square7 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
		int[][] magic_square8 = {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};

		
		for (int i = 0; i < 3; i++) {
			String str = br.readLine();
			String s[] = str.split("\\s+");
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = Integer.parseInt(s[j]);
			}
		}

		int cost = costValue(matrix,magic_square1);
		int minCost = cost;
		
		cost = costValue(matrix,magic_square2);
		if(minCost > cost)
			minCost = cost;
		
		cost = costValue(matrix,magic_square3);
		if(minCost > cost)
			minCost = cost;
		
		cost = costValue(matrix,magic_square4);
		if(minCost > cost)
			minCost = cost;
		
		cost = costValue(matrix,magic_square5);
		if(minCost > cost)
			minCost = cost;
		
		cost = costValue(matrix,magic_square6);
		if(minCost > cost)
			minCost = cost;
		
		cost = costValue(matrix,magic_square7);
		if(minCost > cost)
			minCost = cost;
		
		cost = costValue(matrix,magic_square8);
		if(minCost > cost)
			minCost = cost;
		
		System.out.println(minCost);
	}
}
