package chap03.binary;

public class LogicalOperator {
	public static void main(String[] args) {
//		논리연산자
//		&&, ||, ^, &, |
		
		System.out.println("===and===");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println(false && true);
		
		
		System.out.println("===or===");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(false || true);
		
		
		System.out.println("===xor===");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		System.out.println(false^true);
		
		
		
		System.out.println("=== |  & ===");   //한개짜리는 뒤의 부울값까지 확인
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | false);
		System.out.println(false | true);
		
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & false);
		System.out.println(false & true);
		
	}

}
