package Chap10.textbook.s100202;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		//run -> runconfigurations -> ArrayIndexout...-> arguments -> ����� �迭�ǿ�� �Է�
		
		if(args.length >= 2) { // ���ܹ��� if��
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0] : " + args[0]);
			System.out.println("args[1] : " + args[1]);
		}
		
	}

}
