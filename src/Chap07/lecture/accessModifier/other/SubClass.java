package Chap07.lecture.accessModifier.other;


import Chap07.lecture.accessModifier.MyClass;      //상속을 받더라도 import는 수행해야 함
public class SubClass extends MyClass{
	void method1() {
		System.out.println(publicvar);
		System.out.println(protectedvar);
	}

}
