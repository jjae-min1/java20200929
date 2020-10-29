package chap12.lecture.priority;

public class PriorityEx1 {
	public static void main(String[] args) {
		Thread[] threads = new Thread[20];
		
		for(int i = 0; i<threads.length; i++ ) {
			threads[i] = new Thread() { //배열에 쓰레드들 삽입
				public void run() {
					for(int i = 0; i < 20_0000_0000; i++) {
						
					}
					System.out.println(getName() + "완료");
				}
			};
//			우선순위결정
			if(i>10) {
				threads[i].setPriority(10);  //스레드의 우선순위 설정(0~10, 기본값 5)
			}else {
				threads[i].setPriority(1);
			}
		}
		
//		우선순위에 따라 쓰레드실행
		
		for(Thread t : threads) {
			t.start();
		}
	}

}
