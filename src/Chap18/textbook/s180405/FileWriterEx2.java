package Chap18.textbook.s180405;

import java.io.*;

public class FileWriterEx2 {
	public static void main(String[] args) throws Exception{
		File file = new File("file.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("\n새로 추가된 내용");
		fw.close();
		
	}

}
