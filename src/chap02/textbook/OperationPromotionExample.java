package chap02.textbook;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 18;
		byte byteValue2 = 20;
		
		int intValue1 = byteValue1 + byteValue2; //정수형의 연산결과의 최소타입은 int형
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);   //char형의 연산결과를 int형으로 받을시 유니코드로 출력
		System.out.println("출력문자=" + (char) intValue2); //char형의 연산결과를 char형으로 받을시 문자출력
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);            //정수형의 나눗셈을 정수형타입으로 받을시 소수점 이하의 자리수 버림
		
		int intValue5 = 10;
		
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);               //정수형과 실수형 연산시 결과는 실수형으로 받음
	}

}
