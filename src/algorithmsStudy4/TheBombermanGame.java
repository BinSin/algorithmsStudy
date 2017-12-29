/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/bomber-man/problem
 */

package algorithmsStudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBombermanGame {
	
	public static void finalState(char[][] bomb, int R, int C, int N) {
		int[][] check = new int[R][C];
		
		if(N == 1) {
			for(int i=0; i<R; i++) {
				for(int j=0; j<C; j++) {
					System.out.print(bomb[i][j]);
				}
				System.out.println();
			}
		}
		else if(N%2 == 0) {
			for(int i=0; i<R; i++) {
				for(int j=0; j<C; j++) {
					System.out.print('O');
				}
				System.out.println();
			}
		}
		else {
			int one = 0;
			int two = 0;
			if(N == 3) one = 1; 
			else two = (N/2) % 2;
			
			if(one == 1) two = 1;
			else if(two == 0) two = 2;
			else two = 3;
			
			while(two-- > 0) {
				for(int i=0; i<R; i++) {
					for(int j=0; j<C; j++) {
						if(bomb[i][j] == '.')
							bomb[i][j] = 'O';
						else if(bomb[i][j] == 'O')
							bomb[i][j] = '.';
					}
				}
				
				for(int i=0; i<R; i++) {
					for(int j=0; j<C ; j++) {
						if(bomb[i][j] =='.' && check[i][j] == 0) {
							if(i != 0 && bomb[i-1][j] != '.') {
								bomb[i-1][j] = '.';
								check[i-1][j] = 1;
							}
							if(j != 0 && bomb[i][j-1] != '.') {
								bomb[i][j-1] = '.';
								check[i][j-1] = 1;
							}
							if(i != R-1 && bomb[i+1][j] != '.') {
								bomb[i+1][j] = '.';
								check[i+1][j] = 1;
							}
							if(j != C-1 && bomb[i][j+1] != '.') {
								bomb[i][j+1] = '.';
								check[i][j+1] = 1;
							}
						}
					}
				}
				check = new int[R][C];
			}
			
			for(int i=0; i<R; i++) {
				for(int j=0; j<C; j++) {
					System.out.print(bomb[i][j]);
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s+");
		int R = Integer.parseInt(s[0]);
		int C = Integer.parseInt(s[1]);
		int N = Integer.parseInt(s[2]);
		
		char[][] bomb = new char[R][C];
		for(int i=0; i<R; i++) {
			str = br.readLine();
			for(int j=0; j<C; j++) {
				bomb[i][j] = str.charAt(j);
			}
		}
		
		finalState(bomb, R, C, N);
		
	}
}
