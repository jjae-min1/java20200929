package chap05;

public class ArrayCopyEx02 {
	public static void main(String[] args) {
		int[][] arr1 = {{3, 4}, {88, 99}, {2, 1}};
		int[][] arr2 = new int[arr1.length][];
		
		for(int i =0; i<arr1.length; i++) {
			arr2[i] = arr1[i]; //arr1의 인스턴스 참조값이 대입됨
		}
		
		for(int[] arr: arr2) {    //arr배열 값에 arr2에 저장된 arr1의 참조값 해당 값을 저장
			for(int n : arr) {   //참조값의 해당값이 저장된 arr배열 원소들을 n으로 뽑아냄
				System.out.println(n);
			}
		}
		
	}

}
