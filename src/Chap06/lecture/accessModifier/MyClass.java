package Chap06.lecture.accessModifier;

public class MyClass {
// ����������
//	 public > protected > (default.package private) = �Ⱦ� �� > private
	
//	private : Ŭ���� �������� ��밡��
//	default : ���� ��Ű�� ���� �ܺ� Ŭ�������� ��� ����
//	public : ��� �ܺ� Ŭ�������� ��� ����
	
	public int var1;
	int var2;  //default int;
	private int var3;
	
	void method1() {
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
	
}
