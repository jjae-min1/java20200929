package chap12.lecture.threadClass;

public class ThreadClassEx2 {
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		
		t1.start();       //thread�� ��ӹ޾� override�� run�޼ҵ带 �θ��� �޼ҵ� 
		t2.start();
//		���� start�޼ҵ� 2���� main�޼ҵ忡 ������ ������ ��� ���ÿ� �����	
		for(int i = 0; i<5; i++) {
			System.out.println((char) 'Z' - i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
