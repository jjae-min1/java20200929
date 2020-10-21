package chap11.textbook.s110302;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String>hashMap = new HashMap<Key, String>(); // 다른 인스턴스를 모아서 
//		                                                     저장할 수 있는  인스턴스
		
		hashMap.put(new Key(1), "홍길동");
		 
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
	}

}
