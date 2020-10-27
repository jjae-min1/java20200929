package Chap18.lecture.outputstream;

import java.io.*;

public class OutputStreamEx2 {
	public static void main(String[] args) throws Exception{
		String source = "img_20200827164148_8a70c505.webp";
		String copy = "img_copy";
		
		InputStream is = new FileInputStream(source);
		OutputStream os = new FileOutputStream(copy);
		
		int b = 0;
		while((b = is.read()) != -1) {
			os.write(b);
		}
		
		System.out.println("복사 완료");
		os.flush();
		os.close();
		is.close();
		
		
	}
}
