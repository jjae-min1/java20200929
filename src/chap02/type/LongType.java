package chap02.type;

public class LongType {
	public static void main(String[] args) {
//		long : 8byte             MAX = 9223372036854775807           MIN = -9223372036854775808
		
		long longValue;
		
		longValue = 9223372036854775807l; // long ������ �ִ밪 �ٻ�ġ�� �Է½� ������ ������ �ѱ⶧���� �������� l �ٿ���
		
		System.out.println(longValue);
		
		longValue = -9223372036854775808L;
		System.out.println(longValue);
	}

}
