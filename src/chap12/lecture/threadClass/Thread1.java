package chap12.lecture.threadClass;

public class Thread1 extends Thread{//Thread클래스를 상속받아 동시실행가능한 메소드 사용
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
