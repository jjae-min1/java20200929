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
		System.out.println(loopCnt); //해당파일 총 byte수는 571, 10바이트씩 읽어서 출력값 57 
//										마지막 1번은 9개 읽음
		is.close();
	}

}
