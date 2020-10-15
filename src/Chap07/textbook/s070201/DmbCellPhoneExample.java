package Chap07.textbook.s070201;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellphone dmbCellPhone = new DmbCellphone("자바폰", "검정", 10);
		//서브클래스를 호출하여 수퍼클래스의 필드와 메소드까지사용가능
		
		System.out.println("모델 : " + dmbCellPhone.model );
		System.out.println("색상 : " + dmbCellPhone.color);
		
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmB();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
		
	}
	

}
