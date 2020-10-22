package Chap13.lecture;

public class MyClass<T> {
	public void method1() {
		System.out.println("메소드1");
	}
	
	public void method2(T s) { //T는 method2의 매개변수를 선언 시에 결정되는 일반적인 타입
		System.out.println(s);
	}
}
