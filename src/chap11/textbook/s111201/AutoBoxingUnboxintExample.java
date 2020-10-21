package chap11.textbook.s111201;

public class AutoBoxingUnboxintExample {
	public static void main(String[] args) {
//		AutoBoxing
		
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
//		대입 시 자동 Unboxing 
		
		int value = obj;
		System.out.println("vale : " + value);
		
		
//		연산 시 자동 Unboxing
		
		int result = obj + 100;
		System.out.println("result : " + result);
		
		
	}

}
