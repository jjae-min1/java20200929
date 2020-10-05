package chap02.type;

public class StringType {
	public static void main(String[] args) {
//		String : 문자열 저장
		
		String input = "3.14";
		double v = Double.valueOf(input);        //스트링형을 더블형으로 변환
//		double v = (double) input;    참조와 기본타입은 강제형변환 불가
		System.out.println(v);
		
		String carName;
		carName = "Kia";
		
		System.out.println(carName);
		System.out.println("");
		System.out.println("여러문자열..");
		System.out.println("큰따옴표\" 작은따옴표'");
	}

}
