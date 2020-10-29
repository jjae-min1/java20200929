package chap12.textboos.s120201;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new BeepTask());
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
