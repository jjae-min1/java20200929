package chap14.lecture.lambda;

public class LambdaEx2 {
	public static void main(String[] args) {
//		���ٽ����� �޼ҵ�ȿ� �������� ���� �� �߰�ȣ�� ���� ǥ��
		
		MyInterface o1 = () -> {System.out.println("1��");};
		
		
		MyInterface o2  = () -> {
			System.out.println("hello");
			System.out.println("world");
		};
		
		
		o1.method();
		o2.method();
	}

}
