package chap05;

public class ArrayCopyEx03 {
	public static void main(String[] args) {
		int[][] arr1 = {{3, 4}, {88, 99}, {2,1}};
		int[][] arr2 = new int[arr1.length][];
		
		for (int i = 0 ; i < arr1.length; i++) {
			int[] newArr = new int[arr1[i].length];
//			�迭�� �����Ͽ� �����ϰ��� �ϴ� ��Ʈ������ �������� ����
			
			for (int j = 0; j < arr1[i].length; j++) {
				newArr[j] = arr1[i][j]; // �迭�� arr1�� �� ���� ���� ����
			}
			
			arr2[i] = newArr;  //arr2�� �� �྿ ���� ����  (newArr�� �������� ã�ư� �ش� �� �����)
		}
		
		arr1[0][0] = 100;
		
		for (int[] arr : arr2) {
			for (int n : arr) {
				System.out.println(n);
			}
		}
	}
}



