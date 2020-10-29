package chap12.lecture.concurrency;

public class ConcurrencyEx1 {
	static int field = 0;
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run(){
				for(int i = 0; i<100_0000;i++) {
					field++;
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
		
		Thread t2 = new Thread() {
			public void run(){
				for(int i = 0; i<100_0000;i++) {
					field++;
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
		t1.start();
		t2.start();
		
//		t1과 t2가 field를 공유하며 동시에 진행할시
//		진행도중 순서가 뒤죽박죽 꼬여 field의 값이 증가하기 전에 메모리에 기억하는
//		경우가 발생할 수 있다
//		따라서 쓰레드간 같은값을 연산하는 과정을 선언할 시
//		기대값이 나오지 않을 수 있음
	}

}
