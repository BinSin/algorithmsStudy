package basically;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NestedLogic {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d1 = sc.nextInt();
		int m1 = sc.nextInt();
		int y1 = sc.nextInt();
		int d2 = sc.nextInt();
		int m2 = sc.nextInt();
		int y2 = sc.nextInt();

		int hackos = 0;
		
		if(y1 > y2) {
			hackos = 10000;
		}
		else if(y1 < y2) {
			hackos = 0;
		}
		else {
			if(m1 > m2) {
				hackos = (m1 - m2) * 500;
			}
            else if(m1 < m2) {
                hackos = 0;
            }
			else {
				if(d1 > d2) {
					hackos = (d1 - d2) * 15;
				}
				else {
					hackos = 0;
				}
			}
		}
		System.out.println(hackos);
	}
}