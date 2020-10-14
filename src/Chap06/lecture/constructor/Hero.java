package Chap06.lecture.constructor;

public class Hero {
	String name;
	int power;
	int ee;
	
	public Hero(String name, int power) {
		this.name = name;     // this : 앞으로 만들어질 인스턴스를 대체할 키워드
		this.power = power;
	}
	
	public Hero(String name) {   
		this(name, 100);      //같은 매개변수 구성을 갖는 생성자가 존재할 시 이와같이 표현 가능
	}
	

}
