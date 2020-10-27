package Chap18.lecture.filterstream;

import java.io.*;

public class InputStreamReaderEx2 {
	public static void main(String[] args) throws Exception{
		Reader rd = new InputStreamReader(System.in);
		System.out.println("ÀÔ·Â>");
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
	}

}
