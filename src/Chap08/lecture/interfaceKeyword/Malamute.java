package Chap08.lecture.interfaceKeyword;

public class Malamute extends KindaDog implements Pet/*implements �������̽���*/{
	@Override
	public void bark() {
		System.out.println("�۸�~!");
		
	}
	
	@Override
	public void sit() {
		System.out.println("�����Ʈ�� �ɽ��ϴ�.");
		
	}

}
