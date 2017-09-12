package basically;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlphabeticallyOrder {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int N = in.nextInt();
		 
		 String[] names = new String[N];
		 int num = 0;
		 
		 for(int a0 = 0; a0 < N; a0++){
			 String firstName = in.next();
			 String emailID = in.next();
	        
			 String[] array = emailID.split("@");
			 if(array[1].equals("gmail.com")) {
				 names[num++] = firstName;
	         }
		 }
		 
		 for(int i=0; i<names.length; i++) {
			 for(int j=i+1; j<names.length; j++) {
				 String tmp;
				 
				 if((names[i] == null) || (names[j] == null)) {
					 continue;
				 }
				 
				 if((int)names[i].charAt(0) > (int)names[j].charAt(0)) {
					tmp = names[i];
					names[i] = names[j];
					names[j] = tmp;
				 }
				 
				 else if(names[i].equals(names[j])) {
					 continue;
				 }
				 
				 else if((int)names[i].charAt(0) == (int)names[j].charAt(0)) {
					 String t;
					 for(int z=1 ; z<names.length; z++) {
						 if((int)names[i].charAt(z) > (int)names[j].charAt(z)) {
						 	t = names[i];
						 	names[i] = names[j];
						 	names[j] = t;
						 	break;
						 }
					 }
				 }
			 }
		 }
		 
		 for(String n : names) {
			 if(n == null) continue;
			 System.out.println(n);
		 }
	 }
}
