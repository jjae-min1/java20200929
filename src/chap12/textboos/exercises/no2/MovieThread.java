package chap12.textboos.exercises.no2;

public class MovieThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("�������� ����մϴ�.");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
