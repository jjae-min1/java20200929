package chap03.textbook;

public class InputDataCheckNanExample1 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
//		if(Double.isNaN(val)) {
//			val = 0.0;
//		}
//		
		currentBalance += val;
		System.out.println(currentBalance);
	}

}
