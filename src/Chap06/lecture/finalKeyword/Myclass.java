package Chap06.lecture.finalKeyword;

public class Myclass {
	int field1;
	final int field2;        //�ʵ忡 final ���� ����� ���ʿ� �������� �Ҵ��ؾ� �ϰ� ���� �Ұ�
	
	static final int field3 = 20;
	final static int field4;
	
	Myclass(){
		field2 = 99;
	}
	
	static {
		field4 = 30;
	}
	
	
	

}
