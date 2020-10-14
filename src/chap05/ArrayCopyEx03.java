package chap05;

public class ArrayCopyEx03 {
	public static void main(String[] args) {
		int[][] arr1 = {{3, 4}, {88, 99}, {2,1}};
		int[][] arr2 = new int[arr1.length][];
		
		for (int i = 0 ; i < arr1.length; i++) {
			int[] newArr = new int[arr1[i].length];
//			배열을 생성하여 복사하고자 하는 매트릭스의 참조값을 저장
			
			for (int j = 0; j < arr1[i].length; j++) {
				newArr[j] = arr1[i][j]; // 배열에 arr1의 한 행의 값들 저장
			}
			
			arr2[i] = newArr;  //arr2의 한 행씩 값들 저장  (newArr의 참조값을 찾아가 해당 값 끌어옴)
		}
		
		arr1[0][0] = 100;
		
		for (int[] arr : arr2) {
			for (int n : arr) {
				System.out.println(n);
			}
		}
	}
}



