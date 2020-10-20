package Chap10.textbook.s100301;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) { //runtimeException은 트라이캐치문 꼭 안써도됨, 빨줄도안뜸
		String data1 = "null";
		String data2 = "null";
		

		try{ //arguments에 2개 값을 넣고 실행하면 catch문을 거치지 않고 아래쪽 try문으로 이동
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 nume2");
			return;                   //때문에 아래 try문 실행되지 않고 종료
		}
		
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요");
		}
		
		
	}

}
