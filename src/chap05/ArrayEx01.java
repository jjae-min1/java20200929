package chap05;

public class ArrayEx01 {
	public static void main(String[] args) {
		int i1 = 30;
		int i2 = 50;
		int i3 = 20;
		int i4 = 70;
		
		int[] arr1;  //�迭����(������� ����)
		
		arr1 = new int[3]; //���̼��� (�ν��Ͻ� �����Ͽ� arr1�� �Ҵ�)
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		
		arr1[0] = 99;
		arr1[1] = 88;
		arr1[2] = 77;
		
		for(int i = 0; i < 3; i ++) {
			System.out.println(arr1[i]);
		}
		
		int[] arr2;
		arr2 = arr1;
		arr2[0] = 95;
		System.out.println(arr1[0]);      //arr2�� �������� arr1�� ���Ƽ� arr1[0]�� ���� ����
		
	}

}
