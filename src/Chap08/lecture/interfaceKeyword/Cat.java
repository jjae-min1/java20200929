package Chap08.lecture.interfaceKeyword;

public class Cat extends KindaCat implements Pet{
	@Override
	public void cry() {
		System.out.println("�߿�~~");
		
	}
	
	@Override
	public void sit() {
		System.out.println("����̰� �ɽ��ϴ�.");
		
	}

}
