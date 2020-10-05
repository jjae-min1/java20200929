package chap02.type;

public class IntType {
	public static void main(String[] args) {
		//int : 4byte  MAX = 2147483647, MIN = -2147483648
		
		int intValue = 2147483647;
		System.out.println(intValue);
		
		intValue++;
		System.out.println(intValue);
		
		intValue = -2147483648;
		System.out.println(intValue);
		
//		정수 리터럴
		intValue = 2147483647;
		intValue = 2_147_483_647;
		intValue = 017777777777;         //0을 붙이면 8진법         0x 붙이면 16진법
		System.out.println(intValue);
		
		intValue = 0;
		
	}

}
