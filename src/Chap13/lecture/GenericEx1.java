package Chap13.lecture;

public class GenericEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass(); //���׸� Ŭ���� �Ϲ����� Ŭ����ó�� ��� ����
		o1.method1();
		o1.method2(new Object());
		o1.method2("java");
		o1.method2(300);
		
		MyClass<String> o2 = new MyClass<String>();       //new ������ ������ <>���� ������ ��������
		o2.method1();
		o2.method2("java");
//		o2.method2(new Object());    T�� ��Ʈ�� Ÿ������ �־ ������Ʈ Ÿ�� x
		
		MyClass<Integer> o3 = new MyClass<Integer>();
		o3.method2(100);
		
		
		
	}

}
