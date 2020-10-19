package Chap09.textbook.s090303;

public class Outter {
	public void method1(final int arg) {
		final int loclaVariable = 1;
//		arg, locaVariable 값 변경 불가

		class Inner{
			public void method() {
//				int result = arg + localVariable;
			}
		}
		
	}
	
	public void method2(int arg) {
		int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

}
