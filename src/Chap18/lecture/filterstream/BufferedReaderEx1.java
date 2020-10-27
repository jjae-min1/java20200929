package Chap18.lecture.filterstream;
import java.io.*;
public class BufferedReaderEx1 {
	public static void main(String[] args) throws Exception{
		String path = "src\\Chap18\\lecture\\filterstream\\BufferedReaderEx1.java";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		System.out.println(line);
		
		
		
		
		
		br.close();
		fr.close();
		
	}

}
