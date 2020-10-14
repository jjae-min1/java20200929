package Chap06.lecture.accessModifier;

public class MyClass {
// 접근제한자
//	 public > protected > (default.package private) = 안쓸 때 > private
	
//	private : 클래스 내에서만 사용가능
//	default : 같은 패키지 내의 외부 클래스에서 사용 가능
//	public : 모든 외부 클래스에서 사용 가능
	
	public int var1;
	int var2;  //default int;
	private int var3;
	
	void method1() {
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
	
}
