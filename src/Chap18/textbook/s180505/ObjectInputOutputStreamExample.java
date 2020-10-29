package Chap18.textbook.s180505;
import java.io.*;

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));          //writeObject �޼ҵ带 ���� ���
		oos.writeObject(new Double(3.14));		//ObjectŸ���� �����Ƿ� ���Ÿ�� ��� ����
		oos.writeObject(new int[] {1, 2, 3});
		oos.writeObject(new String("ȫ�浿"));
		
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();          //readObject�޼ҵ带 ���� �Է�
		Double obj2 = (Double) ois.readObject();			//�Է½� ��������ȯ
		int[] obj3 = (int[]) ois.readObject();              //instanceof������ ���°� ����
		String obj4 = (String) ois.readObject();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + " , " + obj3[1] + " , " + obj3[2]);
		System.out.println(obj4);
		
		
		
		
		
		
		
	}

}
