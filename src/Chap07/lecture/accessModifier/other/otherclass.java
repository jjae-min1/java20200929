package Chap07.lecture.accessModifier.other;

import Chap07.lecture.accessModifier.MyClass;

public class otherclass {
	void method1() {
		MyClass o1 = new MyClass();
		System.out.println(o1.publicvar);
//		System.out.println(o1.protectedvar); ��� �ȹ޾Ƽ� Ŭ���� ��� �Ұ�
	}

}
