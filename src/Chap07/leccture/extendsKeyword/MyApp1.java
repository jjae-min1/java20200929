package Chap07.leccture.extendsKeyword;

public class MyApp1 {
	public static void main(String[] args) {
		SubClass o1 = new SubClass();
		
		System.out.println(o1.var1);  //서브클래스가 슈퍼클래스를 상속받아 슈퍼클래스 매소드 사용가능
		o1.method1();
		
		System.out.println(o1.var2);
		o1.method2();
	}

}
