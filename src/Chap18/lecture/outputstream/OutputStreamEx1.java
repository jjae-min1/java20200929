package Chap18.lecture.outputstream;
import java.io.*;

public class OutputStreamEx1 {
	public static void main(String[] args) throws Exception{
		String path = "output.txt";
		OutputStream os = new FileOutputStream(path);
		
		os.write(65);       //OutputStream 도 1byte씩 출력 (A)
		os.write(66);      //(B)
		
		
		byte[] datas = new byte[3];
		datas[0] = 67;
		datas[1] = 68;
		datas[2] = 69;
		
		os.write(datas);
		os.write(datas, 0 , 2); // 배열이름, 시작 인덱스, 길이  
		
		
		os.close();
	}

}
