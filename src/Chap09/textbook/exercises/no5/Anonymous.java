package Chap09.textbook.exercises.no5;

public class Anonymous {
	
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
			
		}
	};
			
			
			
			
	void method1() {
		Vehicle localValue = new Vehicle() {
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
				
			}
		};
		localValue.run();
		
	}
	
	
	void method2(Vehicle v) {
		v.run();
	}

}
