package chap11.textbook.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {

//      �⺻Ÿ��		
//		byte, short, int, long
//		float, double, char, boolean
		
		
//		����Ÿ��
//		Byte, Short, Int, Long
//		Float, Double, Char, Boolean
		
		int i = 1;
		
		Integer in = Integer.valueOf(i);
		
		method1(in);
		
		int j = 2;
		method1(j);     //�ڵ� �ڽ�
		
		int l = in.intValue();
		int k = in;               //�ڵ� ��ڽ�
		
		Integer in2 = 3;
		int m = in2;          //�����Ӱ� ��� ����
	}
	
	public static void method1(Object o) {
		System.out.println(o);
	}

}
