package Chap07.lecture.override;

public class ChildClass extends ParentClass{
	void method2() {
		System.out.println("Child Method");
	}
	
	@Override    //�����Ϸ����� �̸޼ҵ�� ����Ŭ���� �޼ҵ带 ����°Ŷ�� ��Ʈ�� �ִ� annotation
	void method1() {    //��ӹ��� Ŭ������ ���������� �޼ҵ带 �ٽ��Է��ϸ� ������ �������� ���
		System.out.println("child method1!!!!!!!!");
	}

}
