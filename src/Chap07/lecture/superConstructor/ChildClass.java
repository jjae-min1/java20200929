package Chap07.lecture.superConstructor;

public class ChildClass extends ParentClass{
	public ChildClass() {
		super(1); //����Ŭ������ �Ű������� ���� ������ ȣ��
		         // ����Ŭ������ �ش� ������ ���� �� ȣ�� �Ұ�
	}
	
	@Override
	void method1() {
		
		super.method1();
		System.out.println("child method1");
	}

}
