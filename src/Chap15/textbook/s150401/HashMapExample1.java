package Chap15.textbook.s150401;
import java.util.*;

public class HashMapExample1 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("�ſ��",  85);
		map.put("ȫ�浿",  90);
		map.put("���屺",  80);
		map.put("ȫ�浿",  95);
		System.out.println("�� Entry �� : " + map.size());
		
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿")); //map�� ������ �� get�޼ҵ�� Ȯ��
		
		
		System.out.println();
		
//		key���� iterator�� ���� map�� �������� �ޱ�
		Set<String> keySet = map.keySet();  //Key���� ���� Set��ü�� ����� KeySet���� �Ѱ���
		Iterator<String> keyIterator = keySet.iterator(); //iterator()�޼ҵ�� Set�ȿ� ����
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.remove("ȫ�浿");
		System.out.println("�� Entry �� : " + map.size());
		
		
//		<Ű,��> �� ��Ʈ������ Set�� �־ set�� ��� ����ϴ� ������� ���
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
		System.out.println("�� Entry �� : " + map.size());
	}

}
