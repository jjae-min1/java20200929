package Chap18.lecture.filterstream;

import java.io.*;

public class BufferedInputStreamEx1 {
	public static void main(String[] args) throws Exception{
		String path = "04. 기본 타입과 참조 타입의 차이 - new instance.png";
		FileInputStream fis = new FileInputStream(path); //하드디스크까지 가서 읽어옴
		BufferedInputStream bis = new BufferedInputStream(fis);//하드디스크와 프로그램 메모리 사이에
//																데이터를 저장해서 효율적으로 읽어옴
		long start = System.currentTimeMillis();
		while(bis.read() != -1) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("총 읽은 시간 " + (end-start) + "ms");
		
		fis.close();
	}

}
