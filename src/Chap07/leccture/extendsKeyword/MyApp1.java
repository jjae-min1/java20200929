package Chap07.leccture.extendsKeyword;

public class MyApp1 {
	public static void main(String[] args) {
		SubClass o1 = new SubClass();
		
		System.out.println(o1.var1);  //����Ŭ������ ����Ŭ������ ��ӹ޾� ����Ŭ���� �żҵ� ��밡��
		o1.method1();
		
		System.out.println(o1.var2);
		o1.method2();
	}

}
