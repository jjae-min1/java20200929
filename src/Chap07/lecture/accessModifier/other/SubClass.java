package Chap07.lecture.accessModifier.other;


import Chap07.lecture.accessModifier.MyClass;      //����� �޴��� import�� �����ؾ� ��
public class SubClass extends MyClass{
	void method1() {
		System.out.println(publicvar);
		System.out.println(protectedvar);
	}

}
