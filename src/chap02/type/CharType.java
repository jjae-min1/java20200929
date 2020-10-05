package chap02.type;

public class CharType {
	public static void main(String[] args) {
//		char : 2byte    작은따옴표를 이용해 하나의 문자 표현
		
		char charValue;
		
		charValue = 'a';
		System.out.println(charValue);
		
//		charValue = 'ab', '', 불가
		
		charValue = ' ';
		charValue = 44032;
		System.out.println(charValue);
		charValue = '나';
		charValue = '\uac00'; // 16진법
		System.out.println(charValue);
		
	}

}
