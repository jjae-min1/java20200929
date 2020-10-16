package Chap07.textbook.s070706;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1-Child로 변환되지 않음");
		}
		
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2-Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);//Child타입으로 형변환한 Parent타입의 인스턴스는 Child타입으로 강제변환 가능
		
		Parent parentB = new Parent();
		method1(parentB);
//		method2(parentB);단순 Parent 타입의 인스턴스는 Child타입으로 강제형변환 불가
	}
}
