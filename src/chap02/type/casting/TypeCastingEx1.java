package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
//		primitive type 8��
		
//		1byte    2byte   4byte  8byte
//		boolean   char
//		byte     short    int   long
//		                  float  double
		
		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 1000000000000000000L;
		
		
//		�ڵ� type��ȯ(������ ->ū�� �԰���)
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;
		
//		���� �� ��ȯ
		longValue = 3333;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		
//		�ڵ�����ȯ (���� -> �Ǽ�)
		float floatValue = 0.0F;
		double doubleValue = 0.0;
		
		doubleValue = intValue;
		floatValue = intValue;
		
		
		longValue = 9223372036854775807l;
		floatValue = longValue;                // ���κ��� ū �������� ���� �� ������ ��Ȯ�ϰ� �� ���� ���ϰ� �Ҵ°� �߻�
		System.out.println(floatValue);
		
		doubleValue = longValue;
		System.out.println(doubleValue);
		
//		���� ����ȯ (�Ǽ�->����)
		floatValue = 2000.251547F;
		intValue = (int) floatValue;      // �Ҽ��� ������ �� ����
		System.out.println(intValue);
		
	}

}
