package Chap18.lecture.inputstream;

import java.io.*;

public class inputStreamEx1 {
	public static void main(String[] args) throws Exception  {
		String path = "src/Chap18/lecture/inputstream/inputStreamEx1.java";
		InputStream is =  new FileInputStream(path);
		
		int cnt = 0;	
		int r ;
		while((r= is.read())  != -1) {         //1byte�� ����,  ���̻� �о�� ������ ������ -1�� ����
			System.out.print((char) r);
			cnt++;
		}
		System.out.println(cnt);
		
		
		is.close();        //�ܺηκ��� �о���� ����� �� �ݾ������
		
		
		
	}

}
