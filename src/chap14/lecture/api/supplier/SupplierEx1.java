package chap14.lecture.api.supplier;
import java.util.function.Supplier;

public class SupplierEx1 {
	public static void main(String[] args) {
//		입력매개변수는 없고 출력값만 리턴함
//		Supplier<리턴타입> supplier;
//		get메소드로 해당 리턴값 호출
		
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
