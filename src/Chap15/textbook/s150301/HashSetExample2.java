package Chap15.textbook.s150301;

import java.util.*;

public class HashSetExample2 {   //�ߺ������ �ȵż� ����ڰ� ������ Ŭ������ü�� set�����
//								hashCode()�޼ҵ�� equals�޼ҵ带 ������ �ؾ���
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		
		System.out.println("�� ��ä��: " + set.size());
	}

}
