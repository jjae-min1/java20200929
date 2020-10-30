package chap14.lecture.api.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerEx1 {
	public static void main(String[] args) {
//		Consumer : 매개변수 1개를 <T>타입으로 받아 리턴값은 없는 추상인터페이스
		Consumer<Integer> con1 = x -> System.out.println(x*2);
//		con1이라는 인스턴스를 하나의 함수처럼(메소드) 사용함
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
