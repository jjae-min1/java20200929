package chap14.lecture.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Sample1 {
	public static void main(String[] args) {
		List<Integer> names = new ArrayList<>();
		
		names.add(1);
		names.add(2);
		names.add(3);
		names.add(4);
		names.add(5);
		
//		Consumer : FunctionalInterface, �߻�żҵ� : accept(<t> t) 
//		forEach : �Ű������� ConsumerŬ���� Ÿ���� ���,
//		�ش� ��ü���� ��� ��Ҹ� ��ȯ��
		Consumer<Integer> o1 = (s) -> {
			System.out.println(s);
		};
		
		names.forEach(o1); 
//		------------------------------
		
		
//		�Ű������ڸ��� Consumer �������̽� �ڸ��̰�
//		Consumer �������̽��� FunctionalInterface�̹Ƿ�
//		�Ʒ��� ���� ���ٽ����� �ѹ��� ǥ�� ����
		names.forEach(s -> System.out.println(s));  
		
	}
	

}
