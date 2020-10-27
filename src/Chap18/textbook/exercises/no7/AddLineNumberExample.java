package Chap18.textbook.exercises.no7;
import java.io.*;
public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		String filePath = "src/chap18/textbook/exercises/no7/AddLineNumberExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("copy-AddLineNumberExample");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
//		String line1;
//		int cnt = 0;
//		while((line1 = br.readLine()) != null) {
//			cnt++;
//
//			System.out.println(cnt + ":" + line1);
//			
//		}
		
		String line;
		int num = 0;
		String LineNum = null;
		
		while((line = br.readLine()) != null) {
			num++;
			LineNum = num + ":";
			bw.write(LineNum);
			bw.write(line);
			bw.write("\n");
			
			
			
		}
		
		
		bw.close();
		fw.close();
		br.close();
		fr.close();
		
		
	}

}
