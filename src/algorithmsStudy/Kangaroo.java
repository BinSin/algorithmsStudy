package algorithmsStudy;

import java.io.*;

public class Kangaroo {

 	static String kangaroo(int x1, int v1, int x2, int v2) {	
		
		if(v2 > v1) {
			return "NO";
		}
		
		while(x1 < x2) {		
			x1 += v1;
			x2 += v2;
			
			if(x1 == x2) {
				return "YES";
			}
		}
		return "NO";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split("\\s");
		
		int x1 = Integer.parseInt(s[0]);
		int v1 = Integer.parseInt(s[1]);
		int x2 = Integer.parseInt(s[2]);
		int v2 = Integer.parseInt(s[3]);
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
	}
}