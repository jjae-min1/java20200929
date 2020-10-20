package Chap10.textbook.s100201;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		
		System.out.println("프로그램 실행1");
		
		String data = null;
		if(data != null) {
			System.out.println(data.toString());  //널포인터예외발생
		}
		System.out.println("프로그램 실행2");
	}

}
