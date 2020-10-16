package Chap08.textbook.s080301;
import Chap08.textbook.s080201.RemoteControl;
public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;                        //인터페이스타입으로 변수생성후 
		
		rc = new Television();               //해당 변수를사용하고자하는 클래스타입에 넣은뒤 사용
		
		rc.turnOn();
		rc.setVolume(100);
		RemoteControl.changeBattery();
		rc.turnOff();
		
		
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-1);
		rc.turnOff();
		RemoteControl.changeBattery();
		
	}

}
