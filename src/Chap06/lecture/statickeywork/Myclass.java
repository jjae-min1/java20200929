package Chap06.lecture.statickeywork;

public class Myclass { // Ŭ�����ʵ�� �޼ҵ�� �ν��Ͻ� �������� ��� ����
	int var1;  //�ν��Ͻ� �ʵ�
	static int var2;   //Ŭ���� �ʵ�
	
	static { //Myclass ��� �ش� Ŭ���� ȣ��� �ٷ� ����ȴ�.
		System.out.println("static block");
		var2 = 3000;
	}
	
	void method1() { //�ν��Ͻ� �޼ҵ�
		
		System.out.println(var1);
	}
	
	static void method2() { //Ŭ���� �޼ҵ�  
		System.out.println(var2);
	}
}

