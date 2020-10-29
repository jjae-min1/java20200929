package Chap18.textbook.s180505;
import java.io.*;
public class SerializableReader {
	public static void main(String[] args) throws Exception{
//		객체 역직렬화
		
		FileInputStream fis = new FileInputStream("object.dat2");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassA v = (ClassA) ois.readObject();
		System.out.println("field1 : " + v.field1);
		System.out.println("field2.field1 : " + v.field2.field1);
		System.out.println("field3 : " + v.field3);
		System.out.println("field4 : " + v.field4);
		
		
	}

}
