package chap02.type;

public class DoubleType {
	public static void main(String[] args) {
		
//		double = 8Byte
		double doubleValue = 3.14;
		System.out.println(doubleValue);
		
		doubleValue = 3e6;  //3.0 * 10^6
		System.out.println(doubleValue);
		
//		�Ǽ��� ���� ����
		double d1 = 0.1;
		double d2 = 0.2;
		double d3 = d1 + d2;
		System.out.println(d3); //���� 2�������� ��ȯ�� ����ϴµ� �Ҽ��� ������ ���� ������ �ݺ��� �̰��� ��� �߻�
		
	}

}
