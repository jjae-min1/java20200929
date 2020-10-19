package Chap08.textbook.s080303;

import Chap08.textbook.s080201.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{
	
	private int volume;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	public void setVolume(int volum) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� ���� : " + this.volume);
	}
	
	public void search (String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
	
	public static void main(String[] args) {
		RemoteControl o1 = new SmartTelevision();
		o1.turnOn();
		o1.setVolume(100);
		Searchable o2 = new SmartTelevision();
		o2.search("�ٲ�");
		
		
	}
	
	

}
