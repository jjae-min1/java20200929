package Chap06.lecture.thisKeyword;

public class Myapp {
	public static void main(String[] args) {
		Myclass o1 = new Myclass();
		o1.var = 3;              //필드의 var값
		o1.method1();            //메소드 내부의 var값
		
		System.out.println("------------------");
		o1.method2();
		
		Myclass o2 = new Myclass();
		
		o2.var = 5;
		o2.method1();
		
		
		
	}
	

}
