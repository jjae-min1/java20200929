package Chap10.lecture.checkedExceptions;

public class ClassNotFoundExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		try{
			System.out.println("try블록 실행");
			Class.forName("java.lang.String"); // 예외처리 문구가 필요함
			System.out.println("익셉션 발생 X");
		}catch(ClassNotFoundException e){
			System.out.println("익셉션 발생");
		}finally {								//try(catch)문 실행 후 finally코드블록 무조건 실행
			System.out.println("무조건 실행");
		}
		System.out.println("프로그램 종료");
	}

}
