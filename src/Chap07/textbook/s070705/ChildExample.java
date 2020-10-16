package Chap07.textbook.s070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child)parent; 
		
		child.field2 = "yyy";  //parent타입의 인스턴스를 따왔지만 child타입으로 강제변환하여
		child.method3();       //child클래스 내부에있는 필드와 메소드 사용 가능
		
		child.method1();
		child.field1 = "data2";
	}

}
