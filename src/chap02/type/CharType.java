package chap02.type;

public class CharType {
	public static void main(String[] args) {
//		char : 2byte    ��������ǥ�� �̿��� �ϳ��� ���� ǥ��
		
		char charValue;
		
		charValue = 'a';
		System.out.println(charValue);
		
//		charValue = 'ab', '', �Ұ�
		
		charValue = ' ';
		charValue = 44032;
		System.out.println(charValue);
		charValue = '��';
		charValue = '\uac00'; // 16����
		System.out.println(charValue);
		
	}

}
