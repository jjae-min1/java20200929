package chap05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		복사할 배열, 시작인덱스, 복사받을배열, 시작인덱스, 복사할 원소의 범위
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
//			문자열 배열 카피시 남는범위는 null로 채워짐
		}
	}
	
}
