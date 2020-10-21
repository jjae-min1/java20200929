package chap11.object.hashcode;

public class HashCodeEx1 {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1);            //16����
		System.out.println(o2);
		
		System.out.println(o1.hashCode());       //10����
		System.out.println(o2.hashCode());	
		
		
		System.out.println("-----------------");
		
		String s1 = "java";
		String s2 = new String("java");
		
		System.out.println(s1 == s2);            //������ �ٸ�
		
		
		System.out.println(s2.hashCode());          //java ��Ʈ������ �ش��ϴ� �ؽ��ڵ� ���
		System.out.println(s1.hashCode());			//���� ��Ʈ������ �ؽ��Լ��� �� ������ ���
//	                              object Ŭ������ StringŬ������ �ؽ��ڵ�޼ҵ尡 �ٸ�
		System.out.println(s1.hashCode() == s2.hashCode());
	}

}
