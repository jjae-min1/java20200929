package Chap15.lecture.map;

import java.util.*;

public class MapEx1 {
	
	public static void main(String[] args) {
//		(Key, Value)�� (Entry)�� ����
//		Dictionary
		
		Map<Integer, String> map = new HashMap<>();
		
//		�߰�(�Է�) = put
		map.put(100, "kim");
		map.put(30, "hong");
		map.put(22, "lee");
		map.put(11, "choi");
		map.put(200, "jin");
		
		System.out.println(map.size());
		
//		����
		
		map.put(200, "park");  //200�̶�� key�� ã�� park�� ����
		
		System.out.println(map.size());
		
		
//		�˻� = get
		String v1 = map.get(100);   //����Ÿ���� value�� ������ Ÿ��
		System.out.println(v1);
		System.out.println(map.get(200));
		
		
//		���� = remove
		map.remove(200);
		System.out.println(map.size());
		
		
//		��ü Ž�� = keySet (��簴ü�� ���ʺ���Ÿ�Կ� ����)
		Set<Integer> keys = map.keySet();  //Key Ÿ���� int���̹Ƿ� SetŬ����Ÿ��<int>������ ��ü����
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
