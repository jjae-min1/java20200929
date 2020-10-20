package Chap10.lecture.autoclose;

import java.io.FileInputStream;
import java.io.IOException;



public class Ex {
	public static void main(String[] args) {
		//old version
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("File.txt") ;              //파일 읽어오기 시도
		}catch(IOException e) {
			e.printStackTrace();                                //파일 없으면 예외발생
		}finally {
			if(fis != null) {                                  //파일을 읽어온지 확인하고
				try {
					fis.close();                //해당파일을 close()메소드 타게해서 잘 닫혔는지 확인
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
