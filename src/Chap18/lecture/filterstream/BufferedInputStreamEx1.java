package Chap18.lecture.filterstream;

import java.io.*;

public class BufferedInputStreamEx1 {
	public static void main(String[] args) throws Exception{
		String path = "04. �⺻ Ÿ�԰� ���� Ÿ���� ���� - new instance.png";
		FileInputStream fis = new FileInputStream(path); //�ϵ��ũ���� ���� �о��
		BufferedInputStream bis = new BufferedInputStream(fis);//�ϵ��ũ�� ���α׷� �޸� ���̿�
//																�����͸� �����ؼ� ȿ�������� �о��
		long start = System.currentTimeMillis();
		while(bis.read() != -1) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("�� ���� �ð� " + (end-start) + "ms");
		
		fis.close();
	}

}
