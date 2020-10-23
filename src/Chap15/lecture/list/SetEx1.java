package Chap15.lecture.list;

import java.util.*;

public class SetEx1 {
	public static void main(String[] args) {
//		순서가 없고, 중복허용 않음
		Set<String> set = new HashSet<>();
		
		
//		추가
		set.add("java");
		set.add("html");
		set.add("css");
		set.add("java");    //컴파일 오류는 없지만, 중복되는값 삽입 안됨(set.size() == 3)
		set.add(new String("java"));
		set.add("1");
		set.add("2");
		set.add("3");
		
		System.out.println(set.size());
		
//		삭제(set은 순서가 존재하지 않기 때문에 인덱스가 존재하지 않고 해당 객체명을 직접 입력)
		set.remove("jquery"); //해당 객체가 없을시 아무변화도 없음
		System.out.println(set.size());
		set.remove(new String("html"));//html찾아가서 삭제
		System.out.println(set.size());
		set.remove("css");//css찾아가서 삭제
		System.out.println(set.size());
		
		
//		검색 = 모두탐색  (순서가 없기 때문)
		System.out.println("향상된 for문");
		for(String s : set) {
			System.out.println(s); //출력시 원소들의 순서는 랜덤(순서없음)
		}
		
		System.out.println("-------iteraotr");
		Iterator<String> iter = set.iterator();    //Iterator : 탐색하기 위해 만들어진 클래스
//		iter.hasNext(); 해당 객체가 존재하는지 확인
//		iter.next();
		while(iter.hasNext()) {
			String s = iter.next();    //해당 set안에서 하나의 객체 가져오기
			System.out.println(s);
		}
		
		
		
	}

}
