package Chap18.textbook.s180503;
import java.io.*;
public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos); //�ٸ� outputstream�� �Ű������� ����
		
//		dos.writeUTF("ȫ�浿");  //StringŸ�� ��½� UTF
		dos.writeDouble(95.5);   //�������� ���Ÿ�Կ� �°�
		dos.writeInt(1);
		
//		dos.writeUTF("���ڹ�");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		
		
		dos.flush();
		dos.close();
		fos.close();
		
		
		FileInputStream fis = new FileInputStream("primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i < 2 ; i++) {
//			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println( score + " : " + order);
		}
		
		dis.close(); fis.close();
		
		
		
	}
}
