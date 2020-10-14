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
		System.out.println(this.var);  //위의 var값
		System.out.println(var);   //메소드 내부의 var값
	}
	
	void method2() {
		this.method1();
	}
}
