package chap05.lecture.enumtype;

public class EnumTypeEx2 {
	public static void main(String[] args) {
		MyEnum e1 = MyEnum.MY_VALUE;      
		
		//Enum���� ������ EnumŬ������ ��ӵǾ� �ִ�.
		
		System.out.println(e1.name());          
		System.out.println(e1.ordinal());
		MyEnum e2 = MyEnum.valueOf("VALUE3");
		System.out.println(e2);
		System.out.println(e2.name());
		System.out.println(e2.ordinal());
		int diff = e1.compareTo(e2);
		System.out.println(diff);
		System.out.println(e2.compareTo(e1)); //�ε��� �� ��
		
		MyEnum[] arr = MyEnum.values();
//		
		System.out.println(arr.length);
//		
		
		
		
	}

}
