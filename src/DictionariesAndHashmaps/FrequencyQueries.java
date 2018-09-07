package DictionariesAndHashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class FrequencyQueries {
	
	private static void check(Hashtable<Integer, Integer> queries, int data) {
		Enumeration<Integer> e = queries.keys();
		
		while(e.hasMoreElements()) {
			int next = queries.get(e.nextElement());
			if(next == data) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		Hashtable<Integer, Integer> queries = new Hashtable<Integer, Integer>();
		
		while(q-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int query = Integer.parseInt(st.nextToken());
			int data = Integer.parseInt(st.nextToken());
			
			switch(query) {
				case 1 : queries.put(data, queries.getOrDefault(data, 0) + 1); break;
				case 2 : queries.put(data, queries.getOrDefault(data, 1) - 1); break;
				case 3 : check(queries, data); break;
			}
		}
	}
}
