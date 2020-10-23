package Chap15.lecture.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
//		����Ʈ : ������ �ְ� ���� �ߺ� ���
		List<String> list = new ArrayList<>();
		
//		�߰�(add)
		list.add("java");
		list.add("html");
		list.add("css");
		list.add("java");
		
		System.out.println(list.size()); // ����Ʈ�� ũ�� Ȯ��
		
		
//		�˻�(get)
		System.out.println(list.get(1)); 
		System.out.println(list.get(2));
		
		
//		����(set)
		list.set(3, "jsp");
		System.out.println(list.get(3));
		
//		����(remove)
		list.remove(2);
		System.out.println(list);        //������ �� ������ �ε��� ������ ������ �����
		
//		��� �� Ž��
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String s : list) {
			System.out.println(s);
		}
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(4);
		
		
//		�����ڵ�(����Ʈ�� �߰��� Ÿ�Կ� ������� �߰����������� ���� �� ĳ������ �ؾ��ϴ� ���ŷο�)
		List listNotype = new ArrayList();
		listNotype.add("string");
		listNotype.add(3);
		
		Object o1 = listNotype.get(0);
		Object o2 = listNotype.get(1);
		
	}

}
