package Chap18.lecture.inputstream;

import java.io.*;

public class inputStreamEx1 {
	public static void main(String[] args) throws Exception  {
		String path = "src/Chap18/lecture/inputstream/inputStreamEx1.java";
		InputStream is =  new FileInputStream(path);
		
		int cnt = 0;	
		int r ;
		while((r= is.read())  != -1) {         //1byte씩 읽음,  더이상 읽어올 내용이 없을시 -1을 리턴
			System.out.print((char) r);
			cnt++;
		}
		System.out.println(cnt);
		
		
		is.close();        //외부로부터 읽어오고 사용후 꼭 닫아줘야함
		
		
		
	}

}
