/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/matrix-rotation-algo/problem?h_r=next-challenge&h_v=zen
 */

package algorithmsStudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MatrixLayerRotation {
	
	public static int down(int[][] matrix, int me, int ne, int tmp) {
		int t = matrix[me+1][ne];
		matrix[me+1][ne] = tmp;
		return t;
	}
	
	public static int up(int[][] matrix, int me, int ne, int tmp) {
		int t = matrix[me-1][ne];
		matrix[me-1][ne] = tmp;
		return t;
	}
	
	public static int left(int[][] matrix, int me, int ne, int tmp) {
		int t = matrix[me][ne-1];
		matrix[me][ne-1] = tmp;
		return t;
	}
	
	public static int right(int[][] matrix, int me, int ne, int tmp) {
		int t = matrix[me][ne+1];
		matrix[me][ne+1] = tmp;
		return t;
	}
	
	public static int lcm(int m, int n) {
		int deep = Math.min(m, n) / 2;
		int sum = 1;
		while(deep-->0) {
			sum *= (m*2 + (n-2)*2);
		}
		return sum;
	}
	
	public static void printMatrix(int[][] matrix, int m, int n) {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void rotate(int[][] matrix, int m, int n) {
		int min = 0;
		int mmax = m-1, nmax = n-1;
		
		int deep = Math.min(m, n) / 2;
		
		while(deep-->0) {
			int tmp = matrix[min][min];
			int ne = min, me = min;
			while(me < mmax) {
				tmp = down(matrix, me, ne, tmp);
				me++;
			}
			while(ne < nmax) {
				tmp = right(matrix, me, ne, tmp);
				ne++;
			}
			while(me > min) {
				tmp = up(matrix, me, ne, tmp);
				me--;
			}
			while(ne > min) {
				tmp = left(matrix, me, ne, tmp);
				ne--;
			}
			min++;
			mmax--;
			nmax--;
		}
	}
	
	public static void matrixRotation(int[][] matrix, int m, int n, int r) {
		int repeat = r % lcm(m, n);
				
		while(repeat-->0)
			rotate(matrix, m, n);
		
		printMatrix(matrix, m, n);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		int[][] matrix = new int[m][n];
		for(int i=0; i<m; i++) {
			int j = 0;
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			while(st2.hasMoreTokens()) {
				matrix[i][j++] = Integer.parseInt(st2.nextToken());
			}
		}
		
		matrixRotation(matrix, m, n, r);
		
		br.close();
	}
}
