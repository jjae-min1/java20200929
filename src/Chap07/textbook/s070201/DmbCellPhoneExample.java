package Chap07.textbook.s070201;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellphone dmbCellPhone = new DmbCellphone("�ڹ���", "����", 10);
		//����Ŭ������ ȣ���Ͽ� ����Ŭ������ �ʵ�� �޼ҵ������밡��
		
		System.out.println("�� : " + dmbCellPhone.model );
		System.out.println("���� : " + dmbCellPhone.color);
		
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmB();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
		
	}
	

}
