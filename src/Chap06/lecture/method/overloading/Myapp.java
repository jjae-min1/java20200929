package Chap06.lecture.method.overloading;

public class Myapp {
	public static void main(String[] args) {
		Myclass o1 = new Myclass();
		
		o1.method1();
		o1.method1(1);
		o1.method1(0.0);
		o1.method1(1,1);
		o1.method1(1, 0.0);
		o1.method1(0.0, 1);
	}

}
