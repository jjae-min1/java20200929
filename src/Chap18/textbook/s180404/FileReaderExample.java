package Chap18.textbook.s180404;

import java.io.*;

public class FileReaderExample {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("src/Chap18/textbook/s180404/FileReaderExample.java");
		
		int readCharNo; //해당배열에 할당되는 문자 수
		char[] cbuf = new char[100];  //reader는 매개변수로 char형 배열을 받음
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0 , readCharNo);
			System.out.print(data);
		}
		fr.close();
		System.exit(0);
	}

}
