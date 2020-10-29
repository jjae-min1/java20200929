package chap14.lecture.lambda;

public class LambdaEx2 {
	public static void main(String[] args) {
//		람다식으로 메소드안에 여러줄을 넣을 시 중괄호로 묶어 표현
		
		MyInterface o1 = () -> {System.out.println("1줄");};
		
		
		MyInterface o2  = () -> {
			System.out.println("hello");
			System.out.println("world");
		};
		
		
		o1.method();
		o2.method();
	}

}
