package chap03.textbook;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "jdk" + 6.0;
		String str2 = str1 + "Ư¡";
		System.out.println(str2);
		
		String str3 = "jdk" + 3 + 3.0;
		String str4 = 3 + 3.0 + "jdk";
		System.out.println(str3);
		System.out.println(str4);
	}

}
