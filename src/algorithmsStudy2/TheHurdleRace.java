/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheHurdleRace {
	
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] s = str.split("\\s+");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        
        String str2 = br.readLine();
        String[] s2 = str2.split("\\s+");
        int[] height = new int[n];
        for(int i=0; i < n; i++){
            height[i] = Integer.parseInt(s2[i]);
        }
        
        for(int i=0; i < n-1; i++) {
            if(height[i] > height[i+1]) {
                height[i+1] = height[i];
          }
        }
 
        if(k >= height[n-1]) {
            System.out.println("0");
        }
        else {
            System.out.println(height[n-1] - k);
        }
    }
}
