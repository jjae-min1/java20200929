package Chap18.textbook.s180505;
import java.io.*;
public class SerializableWriter {
	public static void main(String[] args) throws Exception{
//		°´Ã¼ Á÷·ÄÈ­
		
		FileOutputStream fos = new FileOutputStream("object.dat2");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3;
		classA.field4 = 4;
		oos.writeObject(classA);
		oos.flush();  oos.close(); fos.close();
		
	}

}
