package chap03.unary;

public class IncDecOperator {
	public static void main(String[] args) {
//		���������� Increment = ++, ������ ���� ���� 1�� ���� �� ������ �ٽ� ����
		
		
//		���ҿ����� Decrement = --, ������ ���� ���� 1�� �� �� ������ �ٽ� ����
		
		
		
		int var1 = 5;
		int var2 = 5;
		
		var1++;
		var2--;
		
		System.out.println(var1);
		System.out.println(var2);
		
		
		
//		�������� ��ġ
//		�����ڰ� �ڿ� ���� ����� �� �Ҵ�, �����ڰ� �տ� ���� �Ҵ� �� ���
		
		int var3 = 5;
		int var4 = 5;
		
		int var5 = 3 + (var3++);          //�ش� �� ���� �� ��������
		System.out.println(var5);
		System.out.println(var3);
		
		int var6 = 3 + (++var4);
		System.out.println(var6);
		
		
		
		
	}

}
