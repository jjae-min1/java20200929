package chap12.textboos.s120203;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스래드 이름 : " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스래드 이름 : " + threadA.getName());
		
		threadA.start();
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스래드 이름 : " + threadB.getName());
		
		threadB.start();
		
		
	}

}
