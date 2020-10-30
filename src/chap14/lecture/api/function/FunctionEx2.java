package chap14.lecture.api.function;

import java.util.HashMap;
import java.util.Map;

public class FunctionEx2 {
	public static void main(String[] args) {
//	replaceAll메소드는 OOFunction을 매개변수로 받음
		Map<String, Integer> map = new HashMap<>();
		map.put("java", 20);
		map.put("jav", 19);
		map.put("jaa", 18);
		map.put("ava", 17);
		map.put("jssava", 16);
		
		map.replaceAll((k, v) -> v * 2);
		
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		
		
	}
	
	
}
