package Chap07.lecture.accessModifier;

public class MyClass {
//	public , protected, (default, package private), private
	
	//public : 모두가능
//	protected :해당 패키지내부와 다른 패키지에 있는 상속받은 클래스 까지 사용가능 
//	(default) : 패키지 내 사용 가능
//	private  : 클래스 내 사용 가능
	
	
	public int publicvar;
	
	protected int protectedvar;
	
	int defaultvar;
	

}
