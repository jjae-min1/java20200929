package chap14.lecture.lambda;

public class LambdaEx1 {
	public static void main(String[] args) {
//		추상메소드가 하나인 (일반적으로)인터페이스의 객체를 만들 때 주로 사용
		
		MyInterface o1 = new MyInterface() {
			@Override
			public void method() {
				System.out.println("추상메소드 재정의");
				
			}
		};
		
//		화살표 기준으로  왼쪽 : 파라미터 , 오른쪽 메소드내용
		MyInterface o2 = () -> System.out.println("추상메소드 재정의2");
		
		o1.method();
		o2.method();
	}
}
