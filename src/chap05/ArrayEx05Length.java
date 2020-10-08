package chap05;

public class ArrayEx05Length {
	public static void main(String[] args) {
		int[] arr1 = {99, 88, 77};
		int[] arr2 = {5, 4, 3, 2, 1};
		
		System.out.println(arr1.length); //해당 배열의 길이
		System.out.println(arr2.length);
		
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr1[i]);
		}
		for(int i = 0; i < arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}
}
