package chap11.classClass;

import java.lang.reflect.Method;

public class ClassClass {
	public static void main(String[] args) throws Exception{
//		1.���ڿ��� ����
		
		Class clazz;
		clazz = Class.forName("java.lang.String");
		
//		2.��ü�� ���� ����
		String s = "java";
		Class c2 = s.getClass();
		
		
//		3.class Ű����� ���� ����
		Class c3 = String.class;
		
		
		System.out.println(clazz == c2);
		System.out.println(c2 == c3);
		
		Method m = clazz.getMethod("getBytes");
		System.out.println(m);
	}

}
