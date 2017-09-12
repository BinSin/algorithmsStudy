package basically;

import java.util.*;

public class BitwiseAND {

	public static int Compare(int n, int k) {
		List<Integer> list = new LinkedList<Integer>();
		int max = 0;
		
		for(int i=1; i<n; i++) {
			for(int j=i+1; j<=n; j++) {
				list.add(Count(i, j));
			}
		}
		
		for(int l : list) {
			if(l < k) {
				if(max < l) {
					max = l;	
				}
			}
		}
		return max;
	}
	
	public static int Count(int n, int k) {
		return n & k;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0=0; a0<t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			
			System.out.println(Compare(n, k));
		}
	}
}
