package chap12.textboos.s120201;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5 ;i++) {
			toolkit.beep();
			try {
				toolkit.beep();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
