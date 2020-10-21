package chap11.textbook.s111203;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
//		String 타입을 기본 타입 으로 바꿔주는 연산자
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("True");
		
//		valueOf() 와의 차이점은 참조타입을 반환하지만 자동 언박싱하기에 차이 없음
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
	}

}
