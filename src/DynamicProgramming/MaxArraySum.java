package DynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MaxArraySum {

	private static int maxSubsetSum(int[] arr) {
		int length = arr.length;
		if(length == 0) return 0;
		arr[0] = Math.max(0, arr[0]);
		
		if(length == 1) return arr[0];
		arr[1] = Math.max(arr[0], arr[1]);
		
		for(int i=2; i<length; i++) {
			arr[i] = Math.max(arr[i-2] + arr[i], arr[i-1]);
		}
		
		for(int i=0; i<length; i++) System.out.println(arr[i]);
		
		
		return arr[length-1];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		bw.write(maxSubsetSum(arr) + "");
		bw.flush();
		bw.close();
	}
}
