package chap14.lecture.api.supplier;
import java.util.function.Supplier;

public class SupplierEx1 {
	public static void main(String[] args) {
//		�Է¸Ű������� ���� ��°��� ������
//		Supplier<����Ÿ��> supplier;
//		get�޼ҵ�� �ش� ���ϰ� ȣ��
		
		Supplier<Double> nextDouble = () -> Math.random();
		Supplier<Integer> lotto = () -> (int) (Math.random()*45 + 1);  
		
		System.out.println(nextDouble.get());
		
		for(int i = 0; i < 6; i++) {
			System.out.println(nextDouble.get());
		}
		
		for(int i = 0; i < 7; i++) {
			System.out.println(lotto.get());
		}
	}

}
