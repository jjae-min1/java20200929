package Chap06.lecture.constructor;

public class ConstructorEx02 {
	public static void main(String[] args) {
		Hero h1 = new Hero("ironman", 100);
		System.out.println(h1.name);
		System.out.println(h1.power);
		
		Hero h2 = new Hero("spider");
		System.out.println(h2.name);
		System.out.println(h2.power);
		
		
	}

}
