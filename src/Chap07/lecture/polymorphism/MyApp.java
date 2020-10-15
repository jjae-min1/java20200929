package Chap07.lecture.polymorphism;

public class MyApp {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.cry();
		
		KindaCat k1 = t1;             //부모 클래스의 인스턴스 생성시 자식클래스의 코드내용 대입 가능 
		
		k1.cry();
		
		Cat c1 = new Cat();
		c1.cry();
		
		KindaCat k2 = c1;
		
		
	}

}
