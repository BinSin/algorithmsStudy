/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/taum-and-bday
 */

package algorithmsStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaumAndBday {

	public static long minSpend(int numOfBlack, int numOfWhite, int costOfBlack, int costOfWhite, int costOfConverting) {
		long totalCostOfBlack = (long)numOfBlack * costOfBlack;
		long totalCostOfWhite = (long)numOfWhite * costOfWhite;
		long totalCost = totalCostOfBlack + totalCostOfWhite;
		
		if(totalCostOfBlack == totalCostOfWhite)
			return totalCost;
		
		if(totalCostOfBlack > (long)numOfBlack * (costOfWhite + costOfConverting)) {
			totalCostOfBlack = (long)numOfBlack * (costOfWhite + costOfConverting);
		}
		
		if(totalCostOfWhite > (long)numOfWhite * (costOfBlack + costOfConverting)) {
			totalCostOfWhite = (long)numOfWhite * (costOfBlack + costOfConverting);
		}
		
		totalCost = totalCostOfBlack + totalCostOfWhite;
		return totalCost;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		while(n-->0) {
			String str = br.readLine();
			String s[] = str.split("\\s+");
			int numOfBlack = Integer.parseInt(s[0]);
			int numOfWhite = Integer.parseInt(s[1]);
			
			String str2 = br.readLine();
			String s2[] = str2.split("\\s+");
			int costOfBlack = Integer.parseInt(s2[0]);
			int costOfWhite = Integer.parseInt(s2[1]);
			int costOfConverting = Integer.parseInt(s2[2]);
			
			System.out.println(minSpend(numOfBlack, numOfWhite, costOfBlack, costOfWhite, costOfConverting));
		}
	}
}
