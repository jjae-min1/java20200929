package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
//		primitive type 8개
		
//		1byte    2byte   4byte  8byte
//		boolean   char
//		byte     short    int   long
//		                  float  double
		
		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 1000000000000000000L;
		
		
//		자동 type변환(작은거 ->큰거 쌉가능)
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;
		
//		강제 형 변환
		longValue = 3333;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		
//		자동형변환 (정수 -> 실수)
		float floatValue = 0.0F;
		double doubleValue = 0.0;
		
		doubleValue = intValue;
		floatValue = intValue;
		
		
		longValue = 9223372036854775807l;
		floatValue = longValue;                // 본인보다 큰 정수값을 받을 순 있지만 정확하게 다 받진 못하고 잃는값 발생
		System.out.println(floatValue);
		
		doubleValue = longValue;
		System.out.println(doubleValue);
		
//		강제 형변환 (실수->정수)
		floatValue = 2000.251547F;
		intValue = (int) floatValue;      // 소수점 이하의 값 버림
		System.out.println(intValue);
		
	}

}
