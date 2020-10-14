package Chap06.textbook.s061302.package1;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A(boolean b){            //모든 패키지에서 사용가능
		
	}
	A(int b){                       //같은 패키지 내에서 사용 가능
		
	}
	private A(String s) {          //같은패키지 내 같은 클래스에서 사용 가능 
		
	}

}
