//�ѱ�
package Chap18.lecture.filterstream;

import java.io.*;

public class InputStreamReaderEx1 {
	public static void main(String[] args) throws Exception{
		String path = "src/Chap18/lecture/filterstream/InputStreamReaderEx1.java";
		InputStream is = new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(is);//�ٸ���Ʈ���� ���δ� ������Ʈ��(Reader)
		
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		
		
		is.close();
		isr.close();
		
	}

}
