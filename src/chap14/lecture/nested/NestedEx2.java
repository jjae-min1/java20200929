package chap14.lecture.nested;

public class NestedEx2 {
	private int outterField;
	
	public void method() {
		MyInterface i1 = () ->{
			int outterField = 3;
			System.out.println("�͸�Ŭ������ ��ü (localClass)");
			System.out.println(this);
			System.out.println(outterField);  //Ŭ������
			System.out.println(NestedEx2.this.outterField);//Ŭ�����ܺ�
		};
		
		
	}
	
	public static void main(String[] args) {
		NestedEx2 n = new NestedEx2();
		n.method();
	}

}
