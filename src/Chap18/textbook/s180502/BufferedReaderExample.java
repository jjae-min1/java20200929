package Chap18.textbook.s180502;
import java.io.*;
public class BufferedReaderExample {
	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println("�Է� : ");
		String lineString = br.readLine();
		
		System.out.println("��� : " + lineString);
		
	}

}
