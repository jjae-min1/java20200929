package Chap06.lecture.method;

public class Myapp {
	public static void main(String[] args) {
		Myclass o1 = new Myclass();
		o1.var1 = 3;
		o1.myMethod();
		
		
		
		Myclass o2 = new Myclass();
		o2.myMethod();
		o2.myMethod2(5);
		
		o2.var1 = 3;
		o2.myMethod2(7);
		
		Myclass o3 = new Myclass();
		
		o3.myMethod3(3, 4);
	}
}
