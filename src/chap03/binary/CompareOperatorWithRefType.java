package chap03.binary;

public class CompareOperatorWithRefType {
	public static void main(String[] args) {
		String s = "java";
		String t = "java";
		
		String u = "ja";
		String v = "va";
		String w = u + v;
		System.out.println(s);
		System.out.println(t);
		System.out.println(w);
		
		System.out.println(s == t);
		System.out.println(s == w);  //s 와 w의 주소값이 다르다
		                             // String 형은 같은 리터럴 값을 여러 변수가 사용 할 때 
//		                                모두 같은 주소값을 사용 따라서 s == t 는 ture, w는 다른 주소값 사용
	}

}
