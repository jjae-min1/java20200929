package chap14.lecture.nested;

public class NestedEx1 {
	public static void main(String[] args) {
		int i = 0;
		
		MyInterface i1 = () -> System.out.println("����");
		
		MyInterface i2 = new MyInterface() {
			public void method() {
				System.out.println("����2" + i);
			};
		};
		i1.method();
		i2.method();
	}
}
