package chap02.textbook;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5;  변수 V2는 if절 내에서만 존재
	}

}
