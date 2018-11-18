/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 */

package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class FraudulentActivityNotifications {
	
    public static int activityNotifications(int[] expenditures, int n, int d) {
        int time = n - d;
        if(time <= 0) return 0;
        
        int notifications = 0;
        
        int[] transactionData = new int[201];
        
        for(int i=0; i<d; i++) {
        	transactionData[expenditures[i]]++;
        }
        
        for(int i=0; i<time; i++) {
        	int spends = expenditures[i+d];
        	int count = 0;
        	float median = 0;
        	
        	int j = 0;
        	for(j=0; j<=200; j++) {
        		count += transactionData[j];
        		if(d%2 == 1) {
	        		if(d/2 <= count-1) {
	    				break;
	        		}
        		}
        		else {
        			if(d/2 <= count) {
        				break;
        			}
        		}
        	}
			
			if(d%2 == 1) {
				median = j;
			}
			else { 
				if(d/2 != count) {
					median = j;
				}
				else {
					median = j;
					for(int l=j+1; l<=200; l++) {
						if(transactionData[l] > 0) {
							median += l;
							median /= 2;
							break;
						}
					}
				}
			}
			
    		if(spends >= median*2) {
    			notifications++;
    		}
    		
    		transactionData[expenditures[i]]--;
    		transactionData[expenditures[i+d]]++;
    		
        }
        
        return notifications;
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(s.nextToken());
		int d = Integer.parseInt(s.nextToken());
		
		int[] expenditure = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		System.out.println(activityNotifications(expenditure, n, d));
		
	}
}
