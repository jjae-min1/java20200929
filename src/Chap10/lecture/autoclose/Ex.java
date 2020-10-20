package Chap10.lecture.autoclose;

import java.io.FileInputStream;
import java.io.IOException;



public class Ex {
	public static void main(String[] args) {
		//old version
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("File.txt") ;              //���� �о���� �õ�
		}catch(IOException e) {
			e.printStackTrace();                                //���� ������ ���ܹ߻�
		}finally {
			if(fis != null) {                                  //������ �о���� Ȯ���ϰ�
				try {
					fis.close();                //�ش������� close()�޼ҵ� Ÿ���ؼ� �� �������� Ȯ��
				}catch(IOException e) {	  
					e.printStackTrace();                         
				}
			}
		}
		
		
		
		//try - with - resources
		try(FileInputStream fis1 = new FileInputStream("file.txt")){
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
	}

}
