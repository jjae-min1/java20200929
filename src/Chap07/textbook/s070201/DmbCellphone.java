package Chap07.textbook.s070201;

public class DmbCellphone extends CellPhone{
	int channel;
	
	DmbCellphone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmB() {
		System.out.println("ä�� " + channel + "�� DMB��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
	}
	
	void turnOffDmb() {
		System.out.println("DmB��� ������ ����ϴ�.");
	}

}
