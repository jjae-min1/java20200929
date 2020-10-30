package chap14.lecture.api.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerEx1 {
	public static void main(String[] args) {
//		Consumer : �Ű����� 1���� <T>Ÿ������ �޾� ���ϰ��� ���� �߻��������̽�
		Consumer<Integer> con1 = x -> System.out.println(x*2);
//		con1�̶�� �ν��Ͻ��� �ϳ��� �Լ�ó��(�޼ҵ�) �����
		con1.accept(30);
		
		System.out.println("======list foreach method========");
		
		List<Integer> list = new ArrayList<>();
		list.add(300);
		list.add(200);
		list.add(100);
		list.add(300);
		list.add(200);
		
		list.forEach(con1);
		System.out.println();
		System.out.println("===list foreach 2=====");
		
		list.forEach(x -> System.out.println("items : " + x));
	}

}
