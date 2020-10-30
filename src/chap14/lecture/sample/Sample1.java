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
		
//		Consumer : FunctionalInterface, 추상매소드 : accept(<t> t) 
//		forEach : 매개변수로 Consumer클래스 타입을 사용,
//		해당 객체내의 모든 요소를 순환함
		Consumer<Integer> o1 = (s) -> {
			System.out.println(s);
		};
		
		names.forEach(o1); 
//		------------------------------
		
		
//		매개변수자리가 Consumer 인터페이스 자리이고
//		Consumer 인터페이스는 FunctionalInterface이므로
//		아래와 같이 람다식으로 한번에 표현 가능
		names.forEach(s -> System.out.println(s));  
		
	}
	

}
