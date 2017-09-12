/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/time-conversion?h_r=next-challenge&h_v=zen
 */

package algorithmsStudy;

import java.util.Scanner;

public class TimeConversion {
	static String timeConversion(String s) {
		String stringHour = s.substring(0, 2);
		int intHour = Integer.parseInt(stringHour);
		String time = s.substring(8);
		
		if(time.equals("PM") &&stringHour.equals("12")) {
			return time;
		}
		else if(time.equals("PM")) {
			intHour += 12;
			return Integer.toString(intHour) + s.substring(2, 8);
		}
		else if(time.equals("AM") && stringHour.equals("12")) {
			intHour -= 12;
			return Integer.toString(intHour) + "0" + s.substring(2, 8);
		}
		else {
			return time;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
	}
}
