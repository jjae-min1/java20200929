package Chap07.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();   //자동 형변환
		
		SuperClass[] arr = new SuperClass[3];
		arr[0] = new SubClass();           //부모클래스의 배열형태의 인스턴스에 자식클래스를 담음
		
		method3(new SubClass());
		
		o1.method1();
		
		
		SubClass o2 = (SubClass) o1;             //강제 형변환
		
		o2.method2();
		
	}
	
	public static void method3(SuperClass s) {
		s.method1();
	}

}
