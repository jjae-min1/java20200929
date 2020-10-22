package Chap13.lecture;

public class GenericEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass(); //제네릭 클래스 일반적인 클래스처럼 사용 가능
		o1.method1();
		o1.method2(new Object());
		o1.method2("java");
		o1.method2(300);
		
		MyClass<String> o2 = new MyClass<String>();       //new 연산자 이후의 <>안의 내용은 생략가능
		o2.method1();
		o2.method2("java");
//		o2.method2(new Object());    T는 스트링 타입으로 넣어서 오브잭트 타입 x
		
		MyClass<Integer> o3 = new MyClass<Integer>();
		o3.method2(100);
		
		
		
	}

}
