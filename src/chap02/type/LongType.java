package chap02.type;

public class LongType {
	public static void main(String[] args) {
//		long : 8byte             MAX = 9223372036854775807           MIN = -9223372036854775808
		
		long longValue;
		
		longValue = 9223372036854775807l; // long 변수의 최대값 근사치를 입력시 정수의 범위를 넘기때문에 마지막에 l 붙여줌
		
		System.out.println(longValue);
		
		longValue = -9223372036854775808L;
		System.out.println(longValue);
	}

}
