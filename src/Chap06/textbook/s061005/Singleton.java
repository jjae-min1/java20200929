package Chap06.textbook.s061005;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		//private 선언시 접근 불가
		//따라서 내부에서 선언한 내용이 윗 내용
	}
	
	static Singleton Getinstance() {
		return singleton;
	}
}
