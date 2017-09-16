package algorithmsStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfTheProgrammer {

	static String solve(int year) {

		if(year>=1700 && year<=1917) {
			if(year%4==0) {
				return "12.09." + year;
			}
			else {
				return "13.09." + year;
			}
		}
		else if(year == 1918) {
			return "26.09." + year;
		}
		else {
			if(year%400 == 0) {
				return "12.09." + year;
			}
			else if(year%4==0 && year%100!=0) {
				return "12.09." + year;
			}
			else {
				return "13.09." + year;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		String result = solve(year);
		System.out.println(result);
	}
}
