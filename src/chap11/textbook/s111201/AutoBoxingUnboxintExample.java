package chap11.textbook.s111201;

public class AutoBoxingUnboxintExample {
	public static void main(String[] args) {
//		AutoBoxing
		
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
//		���� �� �ڵ� Unboxing 
		
		int value = obj;
		System.out.println("vale : " + value);
		
		
//		���� �� �ڵ� Unboxing
		
		int result = obj + 100;
		System.out.println("result : " + result);
		
		
	}

}
