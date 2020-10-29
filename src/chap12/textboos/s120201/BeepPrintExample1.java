package chap12.textboos.s120201;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {     
			toolkit.beep();  //소리남
			try {
				Thread.sleep(500);   //0.5초간 정지
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);      //0.5초간 정지
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}
	}

}
