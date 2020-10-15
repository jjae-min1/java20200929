package Chap07.lecture.override;

public class ChildClass extends ParentClass{
	void method2() {
		System.out.println("Child Method");
	}
	
	@Override    //컴파일러에게 이메소드는 상위클래스 메소드를 덮어쓰는거라고 힌트를 주는 annotation
	void method1() {    //상속받은 클래스의 같은형태의 메소드를 다시입력하면 수정된 내용으로 출력
		System.out.println("child method1!!!!!!!!");
	}

}
