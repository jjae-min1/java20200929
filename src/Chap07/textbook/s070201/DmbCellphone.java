package Chap07.textbook.s070201;

public class DmbCellphone extends CellPhone{
	int channel;
	
	DmbCellphone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmB() {
		System.out.println("채널 " + channel + "번 DMB방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
	}
	
	void turnOffDmb() {
		System.out.println("DmB방송 수신을 멈춥니다.");
	}

}
