package chap05;

public class ArrayCopyEx02 {
	public static void main(String[] args) {
		int[][] arr1 = {{3, 4}, {88, 99}, {2, 1}};
		int[][] arr2 = new int[arr1.length][];
		
		for(int i =0; i<arr1.length; i++) {
			arr2[i] = arr1[i]; //arr1�� �ν��Ͻ� �������� ���Ե�
		}
		
		for(int[] arr: arr2) {    //arr�迭 ���� arr2�� ����� arr1�� ������ �ش� ���� ����
			for(int n : arr) {   //�������� �ش簪�� ����� arr�迭 ���ҵ��� n���� �̾Ƴ�
				System.out.println(n);
			}
		}
		
	}

}
