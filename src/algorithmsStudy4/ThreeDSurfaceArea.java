package algorithmsStudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ThreeDSurfaceArea {
	
	static int surfaceArea(int[][] A, int H, int W) {
		int sum = 0;
		
		for(int i=0; i<H; i++) {
			int max = A[i][0];
			int min = A[i][0];
			int diff = 0;
			for(int j=1; j<W; j++) {
				if(min >= A[i][j]) {
					min = A[i][j];
				}
				else {
					if(max >= A[i][j]) {
						diff = A[i][j] - min;
						sum += diff;
						min = A[i][j];
					}
					else {
						diff = max - min;
						sum += diff;
						max = A[i][j];
						min = A[i][j];
					}
				}
			}
			sum += max;
		}

		for(int i=0; i<W; i++) {
			int max = A[0][i];
			int min = A[0][i];
			int diff = 0;
			for(int j=1; j<H; j++) {
				if(min >= A[j][i]) {
					min = A[j][i];
				}
				else {
					if(max >= A[j][i]) {
						diff = A[j][i] - min;
						sum += diff;
						min = A[j][i];
					}
					else {
						diff = max - min;
						sum += diff;
						max = A[j][i];
						min = A[j][i];
					}
				}
			}
			sum += max;
		}

		sum += H * W;
		
		sum *= 2;
		
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] HW = br.readLine().split("\\s+");
		
		int H = Integer.parseInt(HW[0]);
		int W = Integer.parseInt(HW[1]);
		
		int[][] A = new int[H][W];
		
		for(int i=0; i<H; i++) {
			String[] ARowItems = br.readLine().split("\\s+");
			
			for(int j=0; j<W; j++) {
				int AItem = Integer.parseInt(ARowItems[j]);
				A[i][j] = AItem;
			}
		}
		
		int result = surfaceArea(A, H, W);
			
		System.out.println(result);
		
		br.close();
		
	}
}
