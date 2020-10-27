package Chap18.textbook.s180405;

import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws Exception{
		String src = "src/Chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		File file = new File(des);
		
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(file);
		
		int charNo;
		char[] arr = new char[100];
		while((charNo = fr.read(arr)) != -1) {
			String datas = new String(arr, 0, charNo);
			fw.write(datas);
			
		}
		
		fw.flush();
		fr.close();
		fw.close();
		
	}
}
