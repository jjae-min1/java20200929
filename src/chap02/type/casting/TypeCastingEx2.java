package chap02.type.casting;

public class TypeCastingEx2 {
	public static void main(String[] args) {
		int intValue = 3;
		long longValue = 55;
		
//		int intValue2 = intValue + longValue; ūŸ�԰� ����Ÿ���� �����ϸ� �������� �ڵ����� ū������ ��ȯ �� ����
		
		long longValue2 = intValue + longValue;
		
		double doubleValue = 3.14;
		
//		int intvalue3 = intValue + doubleValue; ���� -> �Ǽ��� �ڵ�,  �Ǽ� -> ������ ����
		
		double doubleValue2 = intValue + doubleValue;
		
//		�������� �������� int 
		short shortValue1 = 3;
		short shortValue2 = 5;
		
//		short shortValue3 = shortValue1 + shortValue2; ���� ������ ����� �ּ� 32bit�̻��� Ÿ������ ����
		
		int intValue4 = shortValue1 + shortValue2;
		
		
	}
}
