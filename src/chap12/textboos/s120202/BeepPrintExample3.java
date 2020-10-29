package chap12.textboos.s120202;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread thread = new BeepThread();     //Thread클래스를 상속받은 클래스형으로 
		thread.start();                       //인스턴스생성
//		소리가나는것(BeepThread)과 아래 for문이 동시에 실행
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
