package Chap18.lecture.writer;

import java.io.*;

public class WriterEx1 {
	public static void main(String[] args) throws Exception{
		String path = "writer.txt";
		Writer writer = new FileWriter(path);
		String text = "���ʤ���ϾƤ÷糪�Ӥ��ӷ礿�Ӥä������錄�Ӥ����췯���Ӥ����츮�ä�";
		
		writer.write(text);  //String �Ű������� �޾� write�޼ҵ带 Ÿ�� �ش� ��Ʈ��
//		                       �� ���Ե� ���� ����
		
		char[] arr = new char[5];
		arr[0] = '��';
		arr[1] = '��';
		arr[2] = '��';
		arr[3] = '��';
		arr[4] = '��';
		
		writer.write(arr);
		writer.write(arr, 2, 3);
		writer.write("\n�̰����ڹٴ�");
		
		writer.close();
		
	}

}
