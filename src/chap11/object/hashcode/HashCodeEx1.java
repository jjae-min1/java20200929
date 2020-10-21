package chap11.object.hashcode;

public class HashCodeEx1 {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1);            //16진법
		System.out.println(o2);
		
		System.out.println(o1.hashCode());       //10진법
		System.out.println(o2.hashCode());	
		
		
		System.out.println("-----------------");
		
		String s1 = "java";
		String s2 = new String("java");
		
		System.out.println(s1 == s2);            //참조값 다름
		
		
		System.out.println(s2.hashCode());          //java 스트링값에 해당하는 해시코드 출력
		System.out.println(s1.hashCode());			//같은 스트링값이 해시함수에 들어가 같은값 출력
//	                              object 클래스와 String클래스의 해시코드메소드가 다름
		System.out.println(s1.hashCode() == s2.hashCode());
	}

}
