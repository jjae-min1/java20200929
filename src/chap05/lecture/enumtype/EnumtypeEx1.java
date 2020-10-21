package chap05.lecture.enumtype;

public class EnumtypeEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		
		MyEnum e1 = MyEnum.VALUE1;
		MyEnum e2 = MyEnum.MY_VALUE;
		MyEnum e3 = MyEnum.MY_VALUE;
		
		System.out.println(e2 == e3);         //MyEnum에 선언한 인스턴스가 4개 뿐이라 
//												해당 인스턴스 내에서만 다루기 때문에 같음
		
		System.out.println(e1.toString());      //Enum에서 재정의한 toString메소드 호출
//												해당 인스턴스가 가르키는 값을 호출함
		System.out.println(e1 instanceof Object);
		System.out.println(e1 instanceof Enum); //Object > Enum 상속
	}
	
	
}

class MyClass {
	
}
