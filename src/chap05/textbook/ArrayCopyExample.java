package chap05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		������ �迭, �����ε���, ��������迭, �����ε���, ������ ������ ����
		for(int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
//			���ڿ� �迭 ī�ǽ� ���¹����� null�� ä����
		}
	}
	
}
