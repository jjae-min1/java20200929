package Chap06.lecture.method.overloading;

public class Myclass {
//	같은 메소드명으로 메소드를 생성시 파라미터를 다르게 해야 함
	void method1(){
		System.out.println("method1....");
	}
	
	void method1(int i) {
		System.out.println("method1##########");
	}
	
	void method1(double j) {
		System.out.println("method1**********");
	}
	
	void method1(int i, int j) {
		System.out.println("method1 int, int");
	}
	
	void method1(int i, double j) {
		System.out.println("method1 int, double");
	}
	
	void method1(double i, int j) {
		System.out.println("method1 double, int");
	}
}
	
//	int method1(double i, int j) {               return타입이 다르더라도 같은유형의 파라미터 x
//		System.out.println("method1 double, int reutrn int");
//	}
//}
