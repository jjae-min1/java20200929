package Chap06.lecture.packageKeyword;

import java.util.Scanner;
import java.lang.String;        //java.lang ��Ű������ �����ϰ� ��� ������
import java.util.*;         //java.util �ȿ� �ִ� ��� Ŭ������ ����Ʈ

public class MyApp {
	public static void main(String[] args) {
		Chap06.lecture.packageKeyword.MyClass o1 
		= new Chap06.lecture.packageKeyword.MyClass(); //Ŭ������ �ٸ� package �ȿ� ���� ��
		
		MyClass o2 = new MyClass(); // Ŭ������ ���� package �ȿ� ���� ��
		
		Chap06.lecture.Myclass o3 = new Chap06.lecture.Myclass();
		
//		java.util.Scanner scanner = new java.util.Scanner(System.in);
//		java.lang.String str = "java";
		
		Scanner scanner = new Scanner(System.in);
		String str2 = "css";
	}
}
