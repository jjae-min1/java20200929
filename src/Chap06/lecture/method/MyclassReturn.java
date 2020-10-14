package Chap06.lecture.method;

public class MyclassReturn {
	int var1;
	
	void method1() {
		System.out.println("메소드1 실행");
	}
	
	int method2() {
		System.out.println("메소드2 실행");
		return var1*2;  //return시 메소드 종료
	}
	

}
