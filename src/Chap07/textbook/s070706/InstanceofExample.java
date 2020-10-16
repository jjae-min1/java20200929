package Chap07.textbook.s070706;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		}else {
			System.out.println("method1-Child�� ��ȯ���� ����");
		}
		
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2-Child�� ��ȯ ����");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);//ChildŸ������ ����ȯ�� ParentŸ���� �ν��Ͻ��� ChildŸ������ ������ȯ ����
		
		Parent parentB = new Parent();
		method1(parentB);
//		method2(parentB);�ܼ� Parent Ÿ���� �ν��Ͻ��� ChildŸ������ ��������ȯ �Ұ�
	}
}
