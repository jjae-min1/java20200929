package Chap06.lecture.packageKeyword;

import java.util.Scanner;
import java.lang.String;        //java.lang 패키지들은 생략하고도 사용 가능함
import java.util.*;         //java.util 안에 있는 모든 클래스들 임포트

public class MyApp {
	public static void main(String[] args) {
		Chap06.lecture.packageKeyword.MyClass o1 
		= new Chap06.lecture.packageKeyword.MyClass(); //클래스가 다른 package 안에 있을 시
		
		MyClass o2 = new MyClass(); // 클래스가 같은 package 안에 있을 시
		
		Chap06.lecture.Myclass o3 = new Chap06.lecture.Myclass();
		
//		java.util.Scanner scanner = new java.util.Scanner(System.in);
//		java.lang.String str = "java";
		
		Scanner scanner = new Scanner(System.in);
		String str2 = "css";
	}
}
