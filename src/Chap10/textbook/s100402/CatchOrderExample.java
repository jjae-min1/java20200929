package Chap10.textbook.s100402;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(ArrayIndexOutOfBoundsException e) {   //catch문을 여러블록 작성시 윗쪽에 입력된
			                                         //예외가 아래쪽예외보다 하위 클래스여야 한다
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
