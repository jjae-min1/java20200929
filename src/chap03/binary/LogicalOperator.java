package chap03.binary;

public class LogicalOperator {
	public static void main(String[] args) {
//		��������
//		&&, ||, ^, &, |
		
		System.out.println("===and===");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println(false && true);
		
		
		System.out.println("===or===");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(false || true);
		
		
		System.out.println("===xor===");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		System.out.println(false^true);
		
		
		
		System.out.println("=== |  & ===");   //�Ѱ�¥���� ���� �οﰪ���� Ȯ��
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | false);
		System.out.println(false | true);
		
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & false);
		System.out.println(false & true);
		
	}

}
