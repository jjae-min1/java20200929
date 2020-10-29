package chap12.lecture.name;

public class NameEx1 {
	public static void main(String[] args) {
		Thread th0 = Thread.currentThread();
		System.out.println(th0.getName());  //현재 사용중인 스레드가 없어 main으로 리턴
		th0.setName("my Main Thread"); //이름을 변경해주는 메소드
		System.out.println(th0.getName());
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println(getName()); //현재 사용중인 인스턴스를 끌고옴
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				
				System.out.println(getName());
				
			}
		};
		t1.start(); //이름을 설정하지 않아 Thread-0 부터 순서대로 증가
		t2.start();
	}

}
