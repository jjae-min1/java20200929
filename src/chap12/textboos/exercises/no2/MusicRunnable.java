package chap12.textboos.exercises.no2;

public class MusicRunnable implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("������ ����մϴ�");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
