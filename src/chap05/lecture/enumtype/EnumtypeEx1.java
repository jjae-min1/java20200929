package chap05.lecture.enumtype;

public class EnumtypeEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		
		MyEnum e1 = MyEnum.VALUE1;
		MyEnum e2 = MyEnum.MY_VALUE;
		MyEnum e3 = MyEnum.MY_VALUE;
		
		System.out.println(e2 == e3);         //MyEnum�� ������ �ν��Ͻ��� 4�� ���̶� 
//												�ش� �ν��Ͻ� �������� �ٷ�� ������ ����
		
		System.out.println(e1.toString());      //Enum���� �������� toString�޼ҵ� ȣ��
//												�ش� �ν��Ͻ��� ����Ű�� ���� ȣ����
		System.out.println(e1 instanceof Object);
		System.out.println(e1 instanceof Enum); //Object > Enum ���
	}
	
	
}

class MyClass {
	
}
