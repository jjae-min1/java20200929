package chap14.lecture.nested;

public class NestedEx2 {
	private int outterField;
	
	public void method() {
		MyInterface i1 = () ->{
			int outterField = 3;
			System.out.println("익명클래스의 객체 (localClass)");
			System.out.println(this);
			System.out.println(outterField);  //클래스내
			System.out.println(NestedEx2.this.outterField);//클래스외부
		};
		
		
	}
	
	public static void main(String[] args) {
		NestedEx2 n = new NestedEx2();
		n.method();
	}

}
