package Chap13.lecture;

public class MyClass<T> {
	public void method1() {
		System.out.println("�޼ҵ�1");
	}
	
	public void method2(T s) { //T�� method2�� �Ű������� ���� �ÿ� �����Ǵ� �Ϲ����� Ÿ��
		System.out.println(s);
	}
}
