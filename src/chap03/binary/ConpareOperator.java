package chap03.binary;

public class ConpareOperator {
	public static void main(String[] args) {
		//�� ������
		/*
		 * ==, !=, <, <=, >, >=
		 * ��� boolean
		 */
		
		int a = 3;
		int b = 5;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a > b);
		System.out.println(a >= b);
		
		double c = 3.0;
		System.out.println(a == c); // ū Ÿ������ ��ȯ �� ��
		
		float d = 0.1f;
		double e = 0.1;
		System.out.println(d == e); // �Ǽ��� �ٻ�ġ�� ��ȯ�Ͽ� ��������� false
		
	}

}
