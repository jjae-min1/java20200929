package chap11.object.equals;

public class EqualsEx1 {
	public static void main(String[] args) {
		Book b1 = new Book(936);
		Book b2 = new Book(936);
		
		//직접 정의한 클래스의 equals값을 같게 하기 위해선
//		1.hashCode() 메소드 재정의    2. equals() 메소드 재정의
		
		System.out.println(b1 == b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		//2개의 메소드가 바코드 값이 같으면 equals가 성립하도록 재정의 해서 트루가 나옴
		System.out.println(b1.equals(b2));
		
		
	}
	

}
