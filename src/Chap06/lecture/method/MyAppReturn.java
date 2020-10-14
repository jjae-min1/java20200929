package Chap06.lecture.method;

public class MyAppReturn {
	public static void main(String[] args) {
		MyclassReturn o1 = new MyclassReturn();
		o1.var1 = 3;
		o1.method1();
		o1.method2();
		
		int v = o1.method2();
		System.out.println(v);
		
		
	}

}
