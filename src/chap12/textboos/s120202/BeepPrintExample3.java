package chap12.textboos.s120202;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread thread = new BeepThread();     //ThreadŬ������ ��ӹ��� Ŭ���������� 
		thread.start();                       //�ν��Ͻ�����
//		�Ҹ������°�(BeepThread)�� �Ʒ� for���� ���ÿ� ����
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
