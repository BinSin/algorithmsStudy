package basically;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.regex.*;

class Email {
	public String name;
	public String email;
	
	public Email(String name, String email) {
		this.name = name;
		this.email = email;
	}
}

public class AlphabeticallyOrder2 {
	static List<Email> emailList;
	
	public static List<String> getGmailUsers() {
		List<String> names = new ArrayList<String>();
		Pattern p = Pattern.compile(".*@gmail.com");
		
		for(Email e : emailList) {
			// compile의 내용이 맞는지 검사
			if(p.matcher(e.email).matches()) {
				// List에 추가
				names.add(e.name);
			}
		}
		// 오름차순
		Collections.sort(names);
		return names;
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		emailList = new ArrayList<Email>();
		int n =  in.nextInt();
		for(int i=0; i<n; i++) {
			emailList.add(new Email(in.next(), in.next()));
		}
		in.close();
		
		for(String name : getGmailUsers()) {
			System.out.println(name);
		}
	}
}
