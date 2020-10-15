package Chap07.lecture.superConstructor;

public class ChildClass extends ParentClass{
	public ChildClass() {
		super(1); //수퍼클래스의 매개변수가 없는 생성자 호출
		         // 수퍼클래스에 해당 생성자 없을 시 호출 불가
	}
	
	@Override
	void method1() {
		
		super.method1();
		System.out.println("child method1");
	}

}
