package Chap09.textbook.s090301;

public class A {
	B field1 = new B();
	C field2 = new C();
	
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
//	static B field3 = new B();      인스턴스 클래스의 정적 필드 초기화 불가
	static C field4 = new C();
	
	static void method2(){
//		B var1 = new B();            정적 메소드에서 인스턴스 클래스 객체 생성 불가
		C var2 = new C();
	}
	
	class B{
		
	}
	
	static class C{
		
	}

}
