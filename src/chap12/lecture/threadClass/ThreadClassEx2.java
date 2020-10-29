package chap12.lecture.threadClass;

public class ThreadClassEx2 {
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		
		t1.start();       //thread를 상속받아 override한 run메소드를 부르는 메소드 
		t2.start();
//		위의 start메소드 2개와 main메소드에 선언한 포문이 모두 동시에 실행됨	
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
