package Chap18.lecture.filterstream;

import java.io.*;

public class OutputStreamWriterEx1 {
	public static void main(String[] args) throws Exception{
		String path = "outputStreamReader.txt";
		FileOutputStream fos = new FileOutputStream(path);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
//		fos.write("วั");
		osw.write("วั");
		
		fos.close();
		osw.close();
	}

}
