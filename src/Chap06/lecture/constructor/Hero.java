package Chap06.lecture.constructor;

public class Hero {
	String name;
	int power;
	int ee;
	
	public Hero(String name, int power) {
		this.name = name;     // this : ������ ������� �ν��Ͻ��� ��ü�� Ű����
		this.power = power;
	}
	
	public Hero(String name) {   
		this(name, 100);      //���� �Ű����� ������ ���� �����ڰ� ������ �� �̿Ͱ��� ǥ�� ����
	}
	

}
