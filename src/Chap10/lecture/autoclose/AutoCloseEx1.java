package Chap10.lecture.autoclose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseEx1 {
	public static void main(String[] args) {
		// old version
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();  //에러가 발생한 메소드의 호출기록 출력
		} finally {
			if (fis != null) {
				try {
					fis.close();      //close()메소드 실행하기 위해 예외처리블록 생성
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		// new version
		// try-with-resources
		try (FileInputStream fis2 = new FileInputStream("file3.txt");
				 FileInputStream fis3 = new FileInputStream("file2.txt");
				) { //try구문에 해당 인스턴스를 직접 생성
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
