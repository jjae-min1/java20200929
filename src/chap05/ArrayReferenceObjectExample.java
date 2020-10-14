package chap05;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]); //배열에 저장된 인스턴스 참조값을 비교
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2])); // 배열에 저장된 문자열 값을 비교
	}

}
