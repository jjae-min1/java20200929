//한글

package Chap18.lecture.reader;

import java.io.*;

public class ReaderEx1 {
	public static void main(String[] args) throws Exception{
		String path = "src/Chap18/lecture/reader/ReaderEx1.java";
		Reader reader = new FileReader(path);
		
		int ch = reader.read(); // 변수에 선언된 해당 파일의 첫 글자를 읽어옴(글자다위로 읽음)
		System.out.println((char)ch); 
		
		
		reader.read();        //2번째 글자
		ch = reader.read();    //3번째 글자
		System.out.println((char)ch);
		
		
		reader.close();
		
		//inputStream
		InputStream is = new FileInputStream(path);
		
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read());        //3번째 읽어올 때 한글을 못읽음
		
		is.close();
		
	}

}
