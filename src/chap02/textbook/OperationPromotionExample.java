package chap02.textbook;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 18;
		byte byteValue2 = 20;
		
		int intValue1 = byteValue1 + byteValue2; //�������� �������� �ּ�Ÿ���� int��
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ�=" + intValue2);   //char���� �������� int������ ������ �����ڵ�� ���
		System.out.println("��¹���=" + (char) intValue2); //char���� �������� char������ ������ �������
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);            //�������� �������� ������Ÿ������ ������ �Ҽ��� ������ �ڸ��� ����
		
		int intValue5 = 10;
		
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);               //�������� �Ǽ��� ����� ����� �Ǽ������� ����
	}

}
