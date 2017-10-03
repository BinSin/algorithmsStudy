/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/append-and-delete
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppendAndDelete {

	public static void convert(String s, String t, int k) {
		int count = 0;
		int minNumber = Math.min(s.length(), t.length());
		for(int i=0; i<minNumber; i++) {
			if(s.charAt(i) == t.charAt(i)) {
				count++;
			}
			else {
				break;
			}
		}
		
//CASE A
        if((s.length()+t.length()-2*count)>k){
            System.out.println("No");
        }
//CASE B
        else if((s.length()+t.length()-2*count)%2==k%2){
            System.out.println("Yes");
        }
//CASE C
        else if((s.length()+t.length()-k)<0){
            System.out.println("Yes");
        }
//CASE D
        else{
            System.out.println("No");
        }	
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();
		int k = Integer.parseInt(br.readLine());

		convert(s, t, k);
	}
}
