package Chap15.textbook.s150401;

import java.util.*;
import java.util.Map.Entry;

public class Ex {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("�垮瘚�", 1);
		map.put("丑望翕", 2);
		map.put("中望翕", 3);
		map.put("之望翕", 4);
		
		System.out.println("�垮瘚� value : " + map.get("�垮瘚�"));
		
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
