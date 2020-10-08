package chap11.textbook;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";           //직접적으로 문자열을 입력시에만 이전에 입력된 동일한 객체에 저장
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
	
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열 가짐");
		}else {
			System.out.println("다른 문자열 가짐");
		}
	}
}
