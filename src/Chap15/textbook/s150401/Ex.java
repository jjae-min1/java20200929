package Chap15.textbook.s150401;

import java.util.*;
import java.util.Map.Entry;

public class Ex {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("ȫ�浿", 1);
		map.put("���浿", 2);
		map.put("���浿", 3);
		map.put("���浿", 4);
		
		System.out.println("ȫ�浿 value : " + map.get("ȫ�浿"));
		
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
