package Chap09.textbook.s090304;




public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();              //����ۿ��ִ� Ŭ����Ÿ���� �ν��Ͻ� ����
		Outter.Nested nested = outter.new Nested(); //������ �ν��Ͻ��� ���� Ŭ����Ÿ���� �ν��Ͻ� ����
		nested.print();
	}


}
