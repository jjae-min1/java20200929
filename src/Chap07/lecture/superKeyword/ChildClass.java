package Chap07.lecture.superKeyword;


public class ChildClass extends ParentClass{
	@Override          //ctrl + spacebar : Override �ϰ��� �ϴ� �޼ҵ� ���
	void method1() {
		super.method1();  //��ӹ��� �޼ҵ忡 ���� �޼ҵ� ȣ��
		System.out.println("child method1");
	}
}
