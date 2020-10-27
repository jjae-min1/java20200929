package Chap18.textbook.s180501;

import java.io.*;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=reader.read(cbuf))!= -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();
		
	}

}
