package chap14.lecture.lambda;

public class LambdaEx1 {
	public static void main(String[] args) {
//		�߻�޼ҵ尡 �ϳ��� (�Ϲ�������)�������̽��� ��ü�� ���� �� �ַ� ���
		
		MyInterface o1 = new MyInterface() {
			@Override
			public void method() {
				System.out.println("�߻�޼ҵ� ������");
				
			}
		};
		
//		ȭ��ǥ ��������  ���� : �Ķ���� , ������ �޼ҵ峻��
		MyInterface o2 = () -> System.out.println("�߻�޼ҵ� ������2");
		
		o1.method();
		o2.method();
	}
}
