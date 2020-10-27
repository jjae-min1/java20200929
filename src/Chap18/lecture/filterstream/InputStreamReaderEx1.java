//한글
package Chap18.lecture.filterstream;

import java.io.*;

public class InputStreamReaderEx1 {
	public static void main(String[] args) throws Exception{
		String path = "src/Chap18/lecture/filterstream/InputStreamReaderEx1.java";
		InputStream is = new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(is);//다른스트림을 감싸는 보조스트림(Reader)
		
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		
		
		is.close();
		isr.close();
		
	}

}
