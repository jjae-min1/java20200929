package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
//		~ : ����(����) 
		int i = 10;
		int j = ~i;
		System.out.println(j);
		
		
//		&, |, ^ (����)
//		�ǿ�����, ��� ��� Integer
		
		int a = 45;
		int b = 25;
		int c = a & b;
		
		
//		bit shift ������
//		>>(�ֻ�����ȣ��Ʈ����), <<, >>>(0���� ä��)
		
		int val = 3;
		int res = val << 3; //val * 3�� ������
		System.out.println(res);
		
		
		int val2 = 16;
		int res2 = val2 >> 3;
		System.out.println(res2);
		
		int val3 = -17;
		int res3 = val3 >>1;
		System.out.println(res3);
		
		
//		-������ ���� ����Ʈ : codingbat.com
		
	}

}
