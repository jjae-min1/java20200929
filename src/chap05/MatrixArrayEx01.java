package chap05;

public class MatrixArrayEx01 {
	public static void main(String[] args) {
		int[][] matrix = new int[3][2];
		
		int[] arr = new int[3];
		System.out.println(arr.length);
		
		System.out.println(matrix[0].length);    //해당 인스턴스의 원소값도 인스턴스 참조값을 갖음 
		System.out.println(matrix[1].length);
		System.out.println(matrix[2].length);
		
	}

}
