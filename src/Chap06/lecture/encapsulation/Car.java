package Chap06.lecture.encapsulation;

public class Car { //Java는 객체지향언어로 변수값을 직접 받기보다는 메소드를 통해 유효성
	int speed;     //을 검토한 뒤 입력값을 받는다
	
	public void setSpeed(int speed) {
		if(speed >= 0 ) {
			this.speed = speed;
		}
	}
	
	public int getSpeed() {
		return this.speed;
		
	}

}
