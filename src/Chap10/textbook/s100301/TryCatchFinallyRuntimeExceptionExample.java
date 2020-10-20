package Chap10.textbook.s100301;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) { //runtimeException�� Ʈ����ĳġ�� �� �Ƚᵵ��, ���ٵ��ȶ�
		String data1 = "null";
		String data2 = "null";
		

		try{ //arguments�� 2�� ���� �ְ� �����ϸ� catch���� ��ġ�� �ʰ� �Ʒ��� try������ �̵�
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 nume2");
			return;                   //������ �Ʒ� try�� ������� �ʰ� ����
		}
		
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		}finally {
			System.out.println("�ٽ� �����ϼ���");
		}
		
		
	}

}
