package Chap07.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();   //�ڵ� ����ȯ
		
		SuperClass[] arr = new SuperClass[3];
		arr[0] = new SubClass();           //�θ�Ŭ������ �迭������ �ν��Ͻ��� �ڽ�Ŭ������ ����
		
		method3(new SubClass());
		
		o1.method1();
		
		
		SubClass o2 = (SubClass) o1;             //���� ����ȯ
		
		o2.method2();
		
	}
	
	public static void method3(SuperClass s) {
		s.method1();
	}

}
