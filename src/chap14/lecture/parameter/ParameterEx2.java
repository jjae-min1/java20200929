package chap14.lecture.parameter;

public class ParameterEx2 {
	public static void main(String[] args) {
		MyInterface2 o1 = (int a, int b) -> System.out.println(a + b);
		o1.method(3, 1);
		
		
//		2�� �̻���� Ÿ�Ը� ���� ����
		MyInterface2 o2 = (a, b) -> System.out.println(a + b);
		o2.method(15, 5);
		
		
	}

}
