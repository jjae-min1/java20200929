package Chap15.textbook.s150401;

import java.util.*;
import java.util.Map.Entry;

public class Ex {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("È«±æµ¿", 1);
		map.put("¤¡±æµ¿", 2);
		map.put("¤¤±æµ¿", 3);
		map.put("¤§±æµ¿", 4);
		
		System.out.println("È«±æµ¿ value : " + map.get("È«±æµ¿"));
		
		System.out.println("---------------------------");
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		Iterator <Map.Entry<String, Integer>> entryIterator = entry.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> result = entryIterator.next();
			System.out.println(result);
			
		}
		
		
		
		System.out.println("-------------------");
		
		Set<Map.Entry<String, Integer>> entry1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator2 = entry1.iterator();
		while(entryIterator2.hasNext()) {
			Entry<String, Integer> result = entryIterator2.next();
			System.out.println(result);
		}
		
		
	}

}
