package Chap07.lecture.superKeyword;


public class ChildClass extends ParentClass{
	@Override          //ctrl + spacebar : Override 하고자 하는 메소드 목록
	void method1() {
		super.method1();  //상속받은 메소드에 기존 메소드 호출
		System.out.println("child method1");
	}
}
