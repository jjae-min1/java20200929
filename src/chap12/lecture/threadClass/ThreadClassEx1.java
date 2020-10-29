package chap12.lecture.threadClass;

public class ThreadClassEx1 {
	public static void main(String[] args) {
//		동시실행 1
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		동시실행 2
		for(int i = 0; i < 5; i++) {
			System.out.println((char) ('a' + i));
		}try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
