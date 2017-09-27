/*
 * A : BinSin
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies
 */

package algorithmsStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulDaysAtTheMovies {
	
/*
	public static int getLength(int num) {
		int count = 1;
		while((num/=10)>0) {
			count++;
		}
		return count;
	}
	
	public static int reverseString(int num) {
		int length = getLength(num);
		int reverseNum = 0;
		int n = num;
		int l = length;
		
		for(int i=0; i<length; i++) {
			reverseNum += (n % 10) * Math.pow(10, --l);
			n /= 10;
		}
		return reverseNum;
	}
	
	public static int countBeautifulNum(int start, int end, int div) {
		int count = 0;
		
		for(int i=start; i<=end; i++) {
			int reverseNum = reverseString(i);
			if((i-reverseNum)%div == 0) {
				count++;
			}
		}
		return count;
	}
*/
	
	public static int countBeautifulNum(String start, String end, int div) {
		int startNum = Integer.parseInt(start);
		int endNum = Integer.parseInt(end);
		int count = 0;
		
		for(int i=startNum; i<=endNum; i++) {
			StringBuilder temp = new StringBuilder();
			temp.append(i);
			temp = temp.reverse();
			int reverseI = Integer.parseInt(temp.toString());
			
			if((i-reverseI)%div == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s+");
		String start = s[0];
		String end = s[1];
		int div = Integer.parseInt(s[2]);
		
		System.out.println(countBeautifulNum(start, end, div));
	}
}
