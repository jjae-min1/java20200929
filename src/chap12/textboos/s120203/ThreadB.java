package chap12.textboos.s120203;

public class ThreadB extends Thread{
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
			try {
				Thread.sleep(500);
				
			}catch(Exception e) {
				
			}
			
		}
	}

}
