package Chap06.textbook.s061005;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		//private ����� ���� �Ұ�
		//���� ���ο��� ������ ������ �� ����
	}
	
	static Singleton Getinstance() {
		return singleton;
	}
}
