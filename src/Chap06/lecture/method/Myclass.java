package Chap06.lecture.method;

public class Myclass {
	int var1;
	
//	�޼ҵ� : �̸��� �ִ� �ڵ� ��
//	�޼ҵ� �̸� : lowreCamelCase
//	�޼ҵ� �Ķ���� : �ڵ� �� �ȿ��� ���Ǵ� ���� ����
//	                  �޼ҵ� ȣ��� �� �Ҵ�
//	�޼ҵ� ����Ÿ�� : �޼ҵ尡 ��ȯ(return)�ؾ� �ϴ� ���� Ÿ��
	
	void myMethod() {
		System.out.println("���� �޼ҵ� ����");
		System.out.println(var1);
	}

	
	void myMethod2(int param) {
		System.out.println("���� �޼ҵ�2 ����");
		System.out.println(param);
		System.out.println(param + var1);
	}
	
	
	void myMethod3(int param1, int param2) {
		
	}
}
