package basically;

import java.util.Scanner;

public class Prime2 {

	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		
		int i=1;
		while(i++ < n/2) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
		
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int T = sc.nextInt();
	       for(int i=0; i<T; i++) {
	    	   System.out.println( (isPrime(sc.nextInt()) ? "Prime" : "Not prime") );
	       }
	       sc.close();
	    }  
}
