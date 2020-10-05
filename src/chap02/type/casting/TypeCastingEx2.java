package chap02.type.casting;

public class TypeCastingEx2 {
	public static void main(String[] args) {
		int intValue = 3;
		long longValue = 55;
		
//		int intValue2 = intValue + longValue; 큰타입과 작은타입을 연산하면 작은값을 자동으로 큰값으로 변환 후 연산
		
		long longValue2 = intValue + longValue;
		
		double doubleValue = 3.14;
		
//		int intvalue3 = intValue + doubleValue; 정수 -> 실수는 자동,  실수 -> 정수는 강제
		
		double doubleValue2 = intValue + doubleValue;
		
//		정수형의 연산결과는 int 
		short shortValue1 = 3;
		short shortValue2 = 5;
		
//		short shortValue3 = shortValue1 + shortValue2; 정수 연산의 결과는 최소 32bit이상의 타입으로 저장
		
		int intValue4 = shortValue1 + shortValue2;
		
		
	}
}
