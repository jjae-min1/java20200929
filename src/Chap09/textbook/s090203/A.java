package Chap09.textbook.s090203;

public class A {
	A(){
		System.out.println("A»ý¼º");
	}
	
	class B{
		B(){
			System.out.println("B");
		}
		
		int field1;
		
		void method1() {
			
		}
	}
	
	static class C{
		C(){
			System.out.println("C");
		}
		
		int field1;
		static int field2;
		
		void method1() {
			
		}
		
		static void method2() {
			
		}
	}
	
	void method() {
		class D{
			D(){
				System.out.println("D");
			}
			int field1;
			void method1() {
				
			}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
