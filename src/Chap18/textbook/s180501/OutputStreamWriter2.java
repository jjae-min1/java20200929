package Chap18.textbook.s180501;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class OutputStreamWriter2 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("OutputStreamWriter.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		fos.close();
		
	}

}
