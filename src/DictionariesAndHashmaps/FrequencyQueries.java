/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/frequency-queries/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */

package DictionariesAndHashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class FrequencyQueries {
	
    private static void put(HashMap<Integer, Integer> queries, int[] freq, int data) {
        queries.put(data, queries.getOrDefault(data, 0) + 1);
        
        int count= queries.get(data);
        freq[count]++;
        if(count > 1)
	        if(freq[count-1] > 0)
	        	freq[count-1]--;
    }
    
    private static void delete(HashMap<Integer, Integer> queries, int[] freq, int data) {
        if(!queries.containsKey(data))
            return;
        
        if(queries.get(data) > 0) {
        	queries.put(data, queries.get(data) - 1);
        	if(queries.get(data) == 0)
        		freq[1]--;
        }

        int count= queries.get(data);
        freq[count]++;
        if(count > 0) 
        	if(freq[count+1] > 0)
        		freq[count+1]--;
    }
    
    private static void checkFreq(StringBuilder ans, int[] freq, int data) {
    	if(freq.length < data) {
    		ans.append(0).append("\n");
    		return;
    	}

    	if(freq[data] > 0)
    		ans.append(1).append("\n");
        else
        	ans.append(0).append("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> queries = new HashMap<Integer, Integer>();
        int[] freq = new int[q+1];
        StringBuilder ans = new StringBuilder();
        
        while(q-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int query = Integer.parseInt(st.nextToken());
            int data = Integer.parseInt(st.nextToken());
            
            switch(query) {
                case 1 : put(queries, freq, data); break;
                case 2 : delete(queries, freq, data); break;
                case 3 : checkFreq(ans, freq, data); break;
            }
        }
        
        System.out.println(ans);
        
    }
}