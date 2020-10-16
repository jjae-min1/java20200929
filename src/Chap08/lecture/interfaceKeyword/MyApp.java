package Chap08.lecture.interfaceKeyword;

public class MyApp {
	public static void main(String[] args) {
		KindaCat c1 = new Cat();
		KindaCat c2 = new Tiger();
		
		KindaDog d1 = new Malamute();
		KindaDog d2 = new Wolf();
		
		
		c1.cry();
		c2.cry();
		
		d1.bark();
		d2.bark();
		
		Pet p1 = new Cat();
		Pet p2 = new Malamute();
		
//		Cat cat1 = (Cat) p1;                강제형변환 가능(예외발생 할 수 있음)
//		Malamute mal1 = (Malamute) p2;
		
		System.out.println(p1 instanceof Cat);
		System.out.println(p1 instanceof KindaCat);
		System.out.println(p1 instanceof Pet);
	}

}
