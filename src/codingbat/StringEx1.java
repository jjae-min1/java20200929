package codingbat;

public class StringEx1 {
	public static void main(String[] args) {
		String str1 = "java";
		
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		
		String str2 = "python";
		String str3 = "python";
		String str4 = "py";
		String str5 = "thon";
		String str6 = str4 + str5;
		//.equals
		System.out.println(str2 == str3);
		System.out.println(str2 == str6);         //��Ʈ�� �񱳽� .equals ���
		System.out.println(str2.equals(str6));
	
		//indexOf
		String str7 = "�ڹ� ���α׷���";
		int a = str7.indexOf("����");              //��ȣ���� ù ���� ������ �ε��� ȣ��         
		System.out.println(a);                     //ã�����ϴ� ���ڿ� ���� �� -1 ���
		
		//charAt
		String str8 = "�̰��� �ڹٴ�";
		int l = str8.length();                   //�ش� ��Ʈ���� ���� ȣ��
		System.out.println(l); 
		System.out.println(str8.charAt(l-1));
		
		//replace
		String str9 = "abcdefabcdefg";
		String str10 = str9.replace("abc", "123");  //�ش� ���ڿ��� �ش� ���ڸ� ���� �Ķ���ͷ� ��ü
		System.out.println(str10);
		
		//substring
		String str11 = "0123456789";
		String sub = str11.substring(2, 3);    //�ش� ��Ʈ������ 2�� index���� 3�� index������ ���ڿ� ȣ��
		System.out.println(sub);
		sub = str11.substring(5, str11.length());
		System.out.println(sub);
		sub = str11.substring(6);       //�ش� �ε������� ������ �ε������� ȣ��
		System.out.println(sub);
		
		
		//trim (��������)
		String str12 = " java";
		String t = str12.trim();
		System.out.println(t);
		System.out.println(str12);
		
		
		
		
		
	}
}
