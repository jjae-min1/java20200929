package Chap18.lecture.writer;

import java.io.*;

public class WriterEx1 {
	public static void main(String[] args) throws Exception{
		String path = "writer.txt";
		Writer writer = new FileWriter(path);
		String text = "ㅇ너ㅏ룸니아ㅓ루나ㅣㅇ머루ㅏㅣㅓㄴㅁㅇ뤄ㅏㅣㄴㅁ우러ㅏㅣㄴㅁ우리ㅓㅏ";
		
		writer.write(text);  //String 매개변수를 받아 write메소드를 타면 해당 스트링
//		                       이 포함된 파일 생성
		
		char[] arr = new char[5];
		arr[0] = '자';
		arr[1] = '바';
		arr[2] = '신';
		arr[3] = '용';
		arr[4] = '권';
		
		writer.write(arr);
		writer.write(arr, 2, 3);
		writer.write("\n이것이자바다");
		
		writer.close();
		
	}

}
