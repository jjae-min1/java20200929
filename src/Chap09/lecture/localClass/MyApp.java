package Chap09.lecture.localClass;

public class MyApp {
	public static void main(String[] args) {
		int i = 3;
		System.out.println(i);
		
		class LocalClass{
			int i;
			
//			static int i;
			
			void method() {
				
			}
//			static void method2(){
			
//			}
		}
		
		LocalClass l1 = new LocalClass();
	}

}
