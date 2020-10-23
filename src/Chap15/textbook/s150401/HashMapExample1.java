package Chap15.textbook.s150401;
import java.util.*;

public class HashMapExample1 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권",  85);
		map.put("홍길동",  90);
		map.put("동장군",  80);
		map.put("홍길동",  95);
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println("\t홍길동 : " + map.get("홍길동")); //map에 저장한 뒤 get메소드로 확인
		
		
		System.out.println();
		
//		key값을 iterator로 돌려 map의 구성값들 받기
		Set<String> keySet = map.keySet();  //Key값을 토대로 Set객체를 만들어 KeySet으로 넘겨줌
		Iterator<String> keyIterator = keySet.iterator(); //iterator()메소드는 Set안에 있음
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		
//		<키,값> 의 엔트리들을 Set에 넣어서 set을 모두 출력하는 방식으로 출력
		Set<Map.Entry<String,Integer>>entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
			
			
		}
		System.out.println();
		
		
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}

}
