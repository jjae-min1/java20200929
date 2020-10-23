package Chap15.lecture.map;

import java.util.*;

public class MapEx1 {
	
	public static void main(String[] args) {
//		(Key, Value)쌍 (Entry)로 저장
//		Dictionary
		
		Map<Integer, String> map = new HashMap<>();
		
//		추가(입력) = put
		map.put(100, "kim");
		map.put(30, "hong");
		map.put(22, "lee");
		map.put(11, "choi");
		map.put(200, "jin");
		
		System.out.println(map.size());
		
//		수정
		
		map.put(200, "park");  //200이라는 key를 찾아 park을 저장
		
		System.out.println(map.size());
		
		
//		검색 = get
		String v1 = map.get(100);   //리턴타입은 value에 설정한 타입
		System.out.println(v1);
		System.out.println(map.get(200));
		
		
//		삭제 = remove
		map.remove(200);
		System.out.println(map.size());
		
		
//		전체 탐색 = keySet (모든객체를 앞쪽변수타입에 리턴)
		Set<Integer> keys = map.keySet();  //Key 타입이 int형이므로 Set클래스타입<int>형으로 객체생성
		for(Integer key : keys) {
			System.out.println(key + ":" + map.get(key)); 
		}
		System.out.println("-------------------------");
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for(Map.Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		
		
		Set<Integer> a = map.keySet();
		Iterator<Integer> i1 = a.iterator();
		while(i1.hasNext()) {
			int k = i1.next();
			String v = map.get(k); 
			System.out.println(k + " : " + v);
		}
		
		
		Set<Map.Entry<Integer, String>> b = map.entrySet();
		Iterator<Map.Entry<Integer, String>> i2 = b.iterator();
		while(i2.hasNext()) {
			Map.Entry<Integer, String> result = i2.next();
			System.out.println(result);
		}
		
		
	}
	

}
