package Chap09.textbook.s090501;

public class AnnoymousExample {
	public static void main(String[] args) {
		Annoymous annoy = new Annoymous();
		
		annoy.field.wake();
		
		annoy.method1();
		
		annoy.method2(
				new Person() {
					void study() {
						System.out.println("�����մϴ�.");
					}
					
					void wake() {
						System.out.println("8�ÿ� �Ͼ�ϴ�.");
						study();
					}
				}
			);	
	}

}
