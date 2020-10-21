package chap11.object.equals;

public class EqualsEx1 {
	public static void main(String[] args) {
		Book b1 = new Book(936);
		Book b2 = new Book(936);
		
		//���� ������ Ŭ������ equals���� ���� �ϱ� ���ؼ�
//		1.hashCode() �޼ҵ� ������    2. equals() �޼ҵ� ������
		
		System.out.println(b1 == b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		//2���� �޼ҵ尡 ���ڵ� ���� ������ equals�� �����ϵ��� ������ �ؼ� Ʈ�簡 ����
		System.out.println(b1.equals(b2));
		
		
	}
	

}
