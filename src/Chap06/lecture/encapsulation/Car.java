package Chap06.lecture.encapsulation;

public class Car { //Java�� ��ü������� �������� ���� �ޱ⺸�ٴ� �޼ҵ带 ���� ��ȿ��
	int speed;     //�� ������ �� �Է°��� �޴´�
	
	public void setSpeed(int speed) {
		if(speed >= 0 ) {
			this.speed = speed;
		}
	}
	
	public int getSpeed() {
		return this.speed;
		
	}

}
