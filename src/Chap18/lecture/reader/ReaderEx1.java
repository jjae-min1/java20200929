//�ѱ�

package Chap18.lecture.reader;

import java.io.*;

public class ReaderEx1 {
	public static void main(String[] args) throws Exception{
		String path = "src/Chap18/lecture/reader/ReaderEx1.java";
		Reader reader = new FileReader(path);
		
		int ch = reader.read(); // ������ ����� �ش� ������ ù ���ڸ� �о��(���ڴ����� ����)
		System.out.println((char)ch); 
		
		
		reader.read();        //2��° ����
		ch = reader.read();    //3��° ����
		System.out.println((char)ch);
		
		
		reader.close();
		
		//inputStream
		InputStream is = new FileInputStream(path);
		
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read());        //3��° �о�� �� �ѱ��� ������
		
		is.close();
		
	}

}
