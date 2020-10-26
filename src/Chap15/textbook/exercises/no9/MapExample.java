package Chap15.textbook.exercises.no9;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		int avg;
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> result = iterator.next();
			String key = result.getKey();
			Integer value = result.getValue();
			totalScore += value;
			if(value > maxScore) {
				maxScore = value;
				name = key;
			}
		}
		avg = totalScore / map.size();
		
		System.out.println("평균점수 : " + avg);
		System.out.println("최고점수 : " + maxScore);   
		
		
		System.out.println("최고점수를 받은 아이디 : " + name);
		
		
		
		
	}

}