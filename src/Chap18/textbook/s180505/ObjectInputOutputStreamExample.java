package Chap18.textbook.s180505;
import java.io.*;

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));          //writeObject 메소드를 통해 출력
		oos.writeObject(new Double(3.14));		//Object타입을 받으므로 모든타입 출력 가능
		oos.writeObject(new int[] {1, 2, 3});
		oos.writeObject(new String("홍길동"));
		
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();          //readObject메소드를 통해 입력
		Double obj2 = (Double) ois.readObject();			//입력시 강제형변환
		int[] obj3 = (int[]) ois.readObject();              //instanceof연산자 쓰는게 좋음
		String obj4 = (String) ois.readObject();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + " , " + obj3[1] + " , " + obj3[2]);
		System.out.println(obj4);
		
		
		
		
		
		
		
	}

}
