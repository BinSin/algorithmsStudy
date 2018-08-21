/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */

package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NewYearChaos {

    public static boolean checkChaos(int[] arr, int n) {
        
        int[] check = new int[n];
        
        for(int i=0; i<n; i++) {
            check[i] = arr[i] - (i+1);
        }
        
        for(int i=0; i<n; i++) {
            if(check[i] > 2)
                return true;
        }
        return false;
        
    }
    
    public static void minimumBribes(int[] arr, int n) {    
        
        if(checkChaos(arr, n)) {
            System.out.println("Too chaotic");
            return;
        }
        
        int bribe = 0;
        
        for(int i=0; i<n; i++) {
            for(int j=Math.max(0, arr[i]-1-1); j<i; j++) {
                if(arr[j] > arr[i]) {
                    bribe++;
                }
            }
        }
        
        System.out.println(bribe);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            
            minimumBribes(arr, n);
        }
    }
}
