package Chap09.textbook.s090304;




public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();              //가장밖에있는 클래스타입의 인스턴스 생성
		Outter.Nested nested = outter.new Nested(); //생성한 인스턴스의 내부 클래스타입의 인스턴스 생성
		nested.print();
	}


}
