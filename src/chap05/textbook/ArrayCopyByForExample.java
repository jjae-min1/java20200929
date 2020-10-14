package chap05.textbook;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i =0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
			
//			int Array를 카피시 남는 범위는 0으로 채워짐
		}
	}

}
