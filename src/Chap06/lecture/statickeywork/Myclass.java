package Chap06.lecture.statickeywork;

public class Myclass { // 클래스필드와 메소드는 인스턴스 생성없이 사용 가능
	int var1;  //인스턴스 필드
	static int var2;   //클래스 필드
	
	static { //Myclass 라는 해당 클래스 호출시 바로 실행된다.
		System.out.println("static block");
		var2 = 3000;
	}
	
	void method1() { //인스턴스 메소드
		
		System.out.println(var1);
	}
	
	static void method2() { //클래스 메소드  
		System.out.println(var2);
	}
}

