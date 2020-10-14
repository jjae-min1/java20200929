package Chap06.lecture.statickeywork;

public class Myapp {
	public static void main(String[] args) {
		Myclass o1 = new Myclass();
		Myclass o2 = new Myclass();
		
		o1.var1 = 1;
		o2.var1 = 2;
		
		
		
		o1.method1();
		o2.method1();
		
		o1.var2 = 100;
		System.out.println(o1.var2);
		System.out.println(o2.var2);
		
		o2.var2 = 200;
		System.out.println(o1.var2);
		
		Myclass.var2 = 300;
		System.out.println(o1.var2);
		System.out.println(o2.var2);
		System.out.println(Myclass.var2);
		
		System.out.println("----------");
		o1.method2();
		o2.method2();
		Myclass.method2();
		
	}

}
