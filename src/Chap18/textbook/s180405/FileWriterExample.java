package Chap18.textbook.s180405;

import java.io.*;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("file.txt");  //file.txt라는 파일을 file에 저장
		FileWriter fw = new FileWriter(file, true);  //true : 기존의 파일끝에 내용 추가
		fw.write("FileWriter는 한글로된 " + "\r\n" );
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}

}
