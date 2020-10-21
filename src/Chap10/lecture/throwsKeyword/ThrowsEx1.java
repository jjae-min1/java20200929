package Chap10.lecture.throwsKeyword;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsEx1 {
	public static void main(String[] args) throws Exception {
		
		method1();  //최초로 선언한 곳 까지 떠넘기면 JVM에게 떠넘겨짐, 그래도 예외상황 발생함
		
	}
	
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception{
		method3();
	}
	
	public static void method3() throws ClassNotFoundException, FileNotFoundException { 
//		해당 메소드 내에서 ClassNotFoundException이 발생하면 직접 처리하지 않고
//		다른 메소드에서 예외를 처리하도록 떠넘김 (throws)
//		Exception으로 단순히 선언하여 모든 예외처리를 떠넘길 수도 있음
//		여러 종류의 예외가 발생할 수 있으면 , 로 구분하여 여러번 선언
		
		Class.forName("java.lang.String2");
		FileReader fr = new FileReader("File.txt");
		
	}

}
