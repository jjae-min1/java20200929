package Chap06.lecture.finalKeyword;

public class Myclass {
	int field1;
	final int field2;        //필드에 final 변수 선언시 최초에 변수값을 할당해야 하고 변경 불가
	
	static final int field3 = 20;
	final static int field4;
	
	Myclass(){
		field2 = 99;
	}
	
	static {
		field4 = 30;
	}
	
	
	

}
