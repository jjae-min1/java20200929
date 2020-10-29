package chap12.textboos.s120401;

public class Calculator {
	private int memory;
	Object lock = new Object();
	
//	public int getMemory() {
//		return memory;
//	}
	
	public void setMemory(int memory) {
		synchronized(lock) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
	
	
}
