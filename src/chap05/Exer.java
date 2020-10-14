package chap05;

public class Exer {
	public static void main(String[] args) {
		int[][] arr1 = { {1, 2, 3}, {4, 5}, {6, 7, 8}};
		int[][] arr2 = new int[arr1.length][];
		
		
		
		for(int i = 0; i < arr1.length ; i++) {
			int[] newArr = new int[arr1.length];
			for(int j = 0; j < arr1[i].length; j++) {
				newArr[j] = arr1[i][j];
			}
			arr2[i] = newArr;
		}
		
		for(int i = 0; i < arr1.length; i ++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
	}

}
