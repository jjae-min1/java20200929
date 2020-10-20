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
			e.printStackTrace();  //������ �߻��� �޼ҵ��� ȣ���� ���
		} finally {
			if (fis != null) {
				try {
					fis.close();      //close()�޼ҵ� �����ϱ� ���� ����ó����� ����
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
				) { //try������ �ش� �ν��Ͻ��� ���� ����
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
