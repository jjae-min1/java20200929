package Chap18.textbook.s180504;

public class VarArgEx1 {
	public static void main(String[] args) {
		method();
		method(100);
		method(99, 98);
	}

	public static void method(int... nums) { //�Ű������� 0�� �̻��̴�
		System.out.println("method ����");
		System.out.println(nums.length);
		
		
		for(int i = 0; i < nums.length; i++ ) {
			System.out.println(nums[i]);
		}
	}
}
