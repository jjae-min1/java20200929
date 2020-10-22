package Chap13.textbook.s130402;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String>p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String>p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		if(result1) {
			System.out.println("논리적으로 동등한 객체");
		}else {
			System.out.println("논리적으로 다른 객체");
		}
		
		
		Pair<String, String>p3 = new Pair<String, String>("user1", "홍길동");
		Pair<String, String>p4 = new Pair<String, String>("user2", "홍길동");
		boolean result2 = Util.compare(p3, p4);  //Pair에서 사용하는 타입과 같아서 유추가능하므로 <>생략
		if(result2) {
			System.out.println("논리적으로 동등객체");
		}else {
			System.out.println("논리적으로 다른객체");
		}
	}

}
