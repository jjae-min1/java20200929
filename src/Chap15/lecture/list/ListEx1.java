package Chap15.lecture.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
//		리스트 : 순서가 있고 값의 중복 허용
		List<String> list = new ArrayList<>();
		
//		추가(add)
		list.add("java");
		list.add("html");
		list.add("css");
		list.add("java");
		
		System.out.println(list.size()); // 리스트의 크기 확인
		
		
//		검색(get)
		System.out.println(list.get(1)); 
		System.out.println(list.get(2));
		
		
//		수정(set)
		list.set(3, "jsp");
		System.out.println(list.get(3));
		
//		삭제(remove)
		list.remove(2);
		System.out.println(list);        //삭제한 뒤 뒷쪽의 인덱스 값들을 앞으로 끌어옴
		
//		모든 값 탐색
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String s : list) {
			System.out.println(s);
		}
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(4);
		
		
//		옛날코드(리스트에 추가시 타입에 상관없이 추가가능하지만 꺼낼 때 캐스팅을 해야하는 번거로움)
		List listNotype = new ArrayList();
		listNotype.add("string");
		listNotype.add(3);
		
		Object o1 = listNotype.get(0);
		Object o2 = listNotype.get(1);
		
	}

}
