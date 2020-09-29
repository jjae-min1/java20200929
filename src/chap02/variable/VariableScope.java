package chap02.variable;

public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		변수의 사용 범위
		
		
		int a = 3;
		
		if(true) {
			int b = 5;
			System.out.println(a);
			System.out.println(b);
		}
		
		System.out.println(a);
//		System.out.println(b);     변수를 선언한 코드블록(해당 중괄호 안)에서만 해당 변수 사용 가능
	}

}
