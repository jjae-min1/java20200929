package Chap07.textbook.s070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child)parent; 
		
		child.field2 = "yyy";  //parentŸ���� �ν��Ͻ��� �������� childŸ������ ������ȯ�Ͽ�
		child.method3();       //childŬ���� ���ο��ִ� �ʵ�� �޼ҵ� ��� ����
		
		child.method1();
		child.field1 = "data2";
	}

}
