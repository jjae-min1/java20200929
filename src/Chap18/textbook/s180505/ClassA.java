package Chap18.textbook.s180505;

import java.io.Serializable;

public class ClassA implements Serializable{ 
	//serializable�������̽��� ��ӹ޾ƾ� �ش� Ŭ���� �ʵ�� write,read �޼ҵ� ��밡��
	
	static final long serialBersionUID = 1L; //������ȭ�� Ŭ������ ������ �˷��ִ� �ĺ��� ��
//	 Ŭ�������� ����� �ĺ����� �޶����� ������ȭ�� �ش� ���� �ٸ��� ���� �߻���
//	                      ó�� �����Ͻ� �ڵ����������� �������Ͻ� ���� �޶����Ƿ� �����ϴ°��� ����
	
	
	int field1;
	ClassB field2 = new ClassB(); //�ٸ�Ŭ����Ÿ���� ������ �� Ŭ������ serializable��ӹ޾ƾ�
	static int field3;
	transient int field4;  //����ȭ ���� ����
	
}
