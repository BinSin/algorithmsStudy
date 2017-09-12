package basically;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prime {

	public static void primalityAlgorithms(int n) {
		int compareNum = 0;
		
		if(n == 1) System.out.println("Not prime");
		
		else {
	 	    for(int i=2; i<n/2+1; i++) {
			   int m = n / i;
			   if(n == m*i) {
				   compareNum = 1;
				   System.out.println("Not prime");
				   break;
			   }
	 	    }
	 	    if(compareNum == 0) {
	 	    	System.out.println("Prime");
	 	    }
		}
	}
		
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       while(T-->0) {
    	   int n = sc.nextInt();
    	   primalityAlgorithms(n);    		   
       }
       sc.close();
    }  
}
