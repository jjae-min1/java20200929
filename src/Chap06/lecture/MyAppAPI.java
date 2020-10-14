package Chap06.lecture;

import java.util.Comparator;

public class MyAppAPI { //API : 미리 만들어진 클래스들을 끌어다 쓸 수 있다.
	public static void main(String[] args) {
		String s = new String("java");
		Comparator<String> a =  s.CASE_INSENSITIVE_ORDER;
		
		String t = new String(new char[] {'h', 't', 'm', 'l'});
		System.out.println(t);
		char c = t.charAt(1);
		System.out.println(c);
		
		}
	}


