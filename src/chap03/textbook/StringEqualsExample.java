package chap03.textbook;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");    //새로운 인스턴스 생성하여 저장
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));  
		System.out.println(strVar1.equals(strVar3));  //해당 리터럴이 같은지 확인
	}

}
