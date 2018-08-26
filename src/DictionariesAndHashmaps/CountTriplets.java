/*
 * Author : BinSin
 * https://www.hackerrank.com/challenges/count-triplets-1/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 */

package DictionariesAndHashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CountTriplets {

	public static long countTriplets(long[] arr, int n, long r) {
		HashMap<Long, Long> map1 = new HashMap<Long, Long>();
		HashMap<Long, Long> map2 = new HashMap<Long, Long>();
		
		long count = 0;
		
		for(int i=n-1; i>=0; i--) {
			long a = arr[i];
			
			if(map2.containsKey(a*r))
				count += map2.get(a*r);
			
			if(map1.containsKey(a*r)) {
				long c = map1.get(a*r);
				map2.put(a, map2.getOrDefault(a, 0L) + c);
			}
			
			map1.put(a, map1.getOrDefault(a, 0L) + 1);
			
			System.out.println("a : " + a);
			System.out.println("count : " + count);
			
		}
		
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		long r = Integer.parseInt(st.nextToken());
		
		long[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
		
		System.out.println(countTriplets(arr, n, r));
		
		br.close();
	}
}
