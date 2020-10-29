package Chap18.textbook.exercises.no11;
import java.io.*;
public class Ex {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream(
				"src/Chap18/textbook/exercises/no11/Ex.java");
		byte[] bytes = new byte[10];
		int i = 0;
		i = fis.read(bytes, 0, bytes.length);
		System.out.println(i);
		
		
	}

}
