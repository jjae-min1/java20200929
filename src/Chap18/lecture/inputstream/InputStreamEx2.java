package Chap18.lecture.inputstream;

import java.io.*;

public class InputStreamEx2 {
	public static void main(String[] args) throws Exception{
		String path = "src/Chap18/lecture/inputstream/InputStreamEx2.java";
		InputStream is = new FileInputStream(path);
		
		byte[] datas = new byte[10];
		
		int readCnt = 0;
		int loopCnt = 0;
		while((readCnt = is.read(datas)) != -1) {
			loopCnt++;
		}
		System.out.println(loopCnt); //�ش����� �� byte���� 571, 10����Ʈ�� �о ��°� 57 
//										������ 1���� 9�� ����
		is.close();
	}

}
