package chap12.lecture.runnable;

public class RunnableInterfaceEx1 {
	public static void main(String[] args) {
//		Thread클래스 객체에 Runnable인터페이스를 상속받은 클래스인스턴스를 넣어 생성
//		다중상속이 안된다는 점에서 Runnable인터페이스가 좀더 유연
		Thread t1 = new Thread(new Runnable1());  
		Thread t2 = new Thread(new Runnable2());
		
		t1.start();
		t2.start();
		
		
		
		
		
	}

}
