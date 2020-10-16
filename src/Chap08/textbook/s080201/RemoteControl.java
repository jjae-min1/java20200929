package Chap08.textbook.s080201;

public interface RemoteControl {
	public int MAX_VOLUME = 10;         //�������̽��� �ʵ� ����� ��� public static final
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) { // public ���� ����
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	static void changeBattery() { //public
		System.out.println("�������� ��ü�մϴ�.");
	}

}
