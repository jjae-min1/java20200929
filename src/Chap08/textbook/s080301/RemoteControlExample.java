package Chap08.textbook.s080301;
import Chap08.textbook.s080201.RemoteControl;
public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;                        //�������̽�Ÿ������ ���������� 
		
		rc = new Television();               //�ش� ����������ϰ����ϴ� Ŭ����Ÿ�Կ� ������ ���
		
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
