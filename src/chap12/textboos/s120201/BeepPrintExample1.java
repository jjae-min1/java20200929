package chap12.textboos.s120201;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {     
			toolkit.beep();  //�Ҹ���
			try {
				Thread.sleep(500);   //0.5�ʰ� ����
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);      //0.5�ʰ� ����
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}
	}

}
