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
		
//		���� ���ͷ�
		intValue = 2147483647;
		intValue = 2_147_483_647;
		intValue = 017777777777;         //0�� ���̸� 8����         0x ���̸� 16����
		System.out.println(intValue);
		
		intValue = 0;
		
	}

}
