package chap03.binary;

public class ConpareOperator {
	public static void main(String[] args) {
		//비교 연산자
		/*
		 * ==, !=, <, <=, >, >=
		 * 결과 boolean
		 */
		
		int a = 3;
		int b = 5;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a > b);
		System.out.println(a >= b);
		
		double c = 3.0;
		System.out.println(a == c); // 큰 타입으로 변환 후 비교
		
		float d = 0.1f;
		double e = 0.1;
		System.out.println(d == e); // 실수는 근사치로 변환하여 저장됨으로 false
		
	}

}
