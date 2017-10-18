/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/the-time-in-words
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheTimeInWords {

	public static void convertTimeIntoWords(int h, int m) {
		String[] hours = {"", "one", "two", "three", "four", "five",
		                  "six", "seven", "eight", "nine", "ten",
		                  "eleven", "twelve", "one"};
		String[] minutes = {"", "one", "two", "three", "four",
							"five",  "six", "seven", "eight", "nine",
							"ten", "eleven", "twelve", "thirteen", "fourteen",
							"quarter", "sixteen", "seventeen", "eighteen",
							"nineteen", "twenty", "twenty one", "twenty two",
							"twenty three", "twenty four", "twenty five", "twenty six",
							"twenty seven", "twenty eight", "twenty nine",
							"half"};
		
		if(m == 0) {
			System.out.println(hours[h] + " o' clock");
		}
		else if(m <= 30) {
			if(m == 15 || m == 30) {
				System.out.println(minutes[m] + " past " + hours[h]);
			}
			else {
			System.out.println(minutes[m] + " minutes past " + hours[h]);
			}
		}
		else {
			if(m == 45) {
				System.out.println(minutes[60 - m] + " to " + hours[h + 1]);
			}
			else {
				System.out.println(minutes[60 - m] + " minutes to " + hours[h + 1]);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int hour = Integer.parseInt(br.readLine());
		int minute = Integer.parseInt(br.readLine());
		convertTimeIntoWords(hour, minute);		
	}
}
