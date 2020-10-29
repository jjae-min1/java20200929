package chap12.textboos.s120301;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(int i = 0; i <200000000;i++) {
			
		}
		System.out.println(getName());
	}
	

}
