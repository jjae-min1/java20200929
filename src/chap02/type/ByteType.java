package chap02.type;

public class ByteType {
	public static void main(String[] args) {
//		byte : 정수형
//		크기 : 1byte (8bit)
//		0 : 0000 0000, 1: 0000 0001, 2: 0000 0010 ***
//		127 : 0111 1111 = 2^7 - 1                 맨 앞 비트가 0이면 양수or양수, 1이면 음수
		
//		127 + 1 : 1000 0000 = -128
//		0 - 1 : 1111 1111
//		-2 : 1111 1110
		
		byte byteValue ;
		byteValue = 0;
		System.out.println(byteValue);
		
//		byteValue = 128;        오류발생
		
		byteValue = 127;
		byteValue += 1;
		
		System.out.println(byteValue);
	
	}

}
