package Chap07.lecture.polymorphism;

public class MyApp {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.cry();
		
		KindaCat k1 = t1;             //�θ� Ŭ������ �ν��Ͻ� ������ �ڽ�Ŭ������ �ڵ峻�� ���� ���� 
		
		k1.cry();
		
		Cat c1 = new Cat();
		c1.cry();
		
		KindaCat k2 = c1;
		
		
	}

}
