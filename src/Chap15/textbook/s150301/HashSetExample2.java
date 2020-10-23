package Chap15.textbook.s150301;

import java.util.*;

public class HashSetExample2 {   //중복허용이 안돼서 사용자가 정의한 클래스객체로 set선언시
//								hashCode()메소드와 equals메소드를 재정의 해야함
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객채수: " + set.size());
	}

}
