package Chap06.lecture.thisKeyword;

public class Myclass {
	int var;
	
	Myclass(){
		
	}
	
	Myclass(int var){
		this.var = var;
		
	}
	
	void method1() {
		int var = 5;
		System.out.println(this.var);  //���� var��
		System.out.println(var);   //�޼ҵ� ������ var��
	}
	
	void method2() {
		this.method1();
	}
}
