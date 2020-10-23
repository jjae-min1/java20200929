package Chap15.lecture.list;

import java.util.*;

public class SetEx1 {
	public static void main(String[] args) {
//		������ ����, �ߺ���� ����
		Set<String> set = new HashSet<>();
		
		
//		�߰�
		set.add("java");
		set.add("html");
		set.add("css");
		set.add("java");    //������ ������ ������, �ߺ��Ǵ°� ���� �ȵ�(set.size() == 3)
		set.add(new String("java"));
		set.add("1");
		set.add("2");
		set.add("3");
		
		System.out.println(set.size());
		
//		����(set�� ������ �������� �ʱ� ������ �ε����� �������� �ʰ� �ش� ��ü���� ���� �Է�)
		set.remove("jquery"); //�ش� ��ü�� ������ �ƹ���ȭ�� ����
		System.out.println(set.size());
		set.remove(new String("html"));//htmlã�ư��� ����
		System.out.println(set.size());
		set.remove("css");//cssã�ư��� ����
		System.out.println(set.size());
		
		
//		�˻� = ���Ž��  (������ ���� ����)
		System.out.println("���� for��");
		for(String s : set) {
			System.out.println(s); //��½� ���ҵ��� ������ ����(��������)
		}
		
		System.out.println("-------iteraotr");
		Iterator<String> iter = set.iterator();    //Iterator : Ž���ϱ� ���� ������� Ŭ����
//		iter.hasNext(); �ش� ��ü�� �����ϴ��� Ȯ��
//		iter.next();
		while(iter.hasNext()) {
			String s = iter.next();    //�ش� set�ȿ��� �ϳ��� ��ü ��������
			System.out.println(s);
		}
		
		
		
	}

}
