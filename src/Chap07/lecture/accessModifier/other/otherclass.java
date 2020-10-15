package Chap07.lecture.accessModifier.other;

import Chap07.lecture.accessModifier.MyClass;

public class otherclass {
	void method1() {
		MyClass o1 = new MyClass();
		System.out.println(o1.publicvar);
//		System.out.println(o1.protectedvar); 상속 안받아서 클래스 사용 불가
	}

}
