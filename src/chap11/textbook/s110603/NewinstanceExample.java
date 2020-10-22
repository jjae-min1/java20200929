package chap11.textbook.s110603;

public class NewinstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("chap11.textbook.s110603.SendAction");
			Action action = (Action) clazz.newInstance(); //SendAction인스턴스 생성
			action.execute(); //인터페이스에 execute메소드를 SendAction 인스턴스로 실행
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(InstantiationException e) { // 행 하고자 하는 클래스가 추상클래스 or 인터페이스
			e.printStackTrace();
		}catch(IllegalAccessException e) { // 접근자에 의한 에러
			e.printStackTrace();
		}
	}

}




