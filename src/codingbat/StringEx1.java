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
		System.out.println(str2 == str6);         //스트링 비교시 .equals 사용
		System.out.println(str2.equals(str6));
	
		//indexOf
		String str7 = "자바 프로그래밍";
		int a = str7.indexOf("프로");              //괄호안의 첫 번재 글자의 인덱스 호출         
		System.out.println(a);                     //찾고자하는 문자열 없을 시 -1 출력
		
		//charAt
		String str8 = "이것이 자바다";
		int l = str8.length();                   //해당 스트링의 길이 호출
		System.out.println(l); 
		System.out.println(str8.charAt(l-1));
		
		//replace
		String str9 = "abcdefabcdefg";
		String str10 = str9.replace("abc", "123");  //해당 문자열의 해당 문자를 뒷쪽 파라미터로 대체
		System.out.println(str10);
		
		//substring
		String str11 = "0123456789";
		String sub = str11.substring(2, 3);    //해당 스트링에서 2번 index부터 3번 index이전의 문자열 호출
		System.out.println(sub);
		sub = str11.substring(5, str11.length());
		System.out.println(sub);
		sub = str11.substring(6);       //해당 인덱스부터 마지막 인덱스까지 호출
		System.out.println(sub);
		
		
		//trim (공백제거)
		String str12 = " java";
		String t = str12.trim();
		System.out.println(t);
		System.out.println(str12);
		
		
		
		
		
	}
}
