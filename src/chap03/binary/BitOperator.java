package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
//		~ : 반전(단항) 
		int i = 10;
		int j = ~i;
		System.out.println(j);
		
		
//		&, |, ^ (이항)
//		피연산자, 결과 모두 Integer
		
		int a = 45;
		int b = 25;
		int c = a & b;
		
		
//		bit shift 연산자
//		>>(최상위부호비트따라감), <<, >>>(0으로 채움)
		
		int val = 3;
		int res = val << 3; //val * 3과 같은값
		System.out.println(res);
		
		
		int val2 = 16;
		int res2 = val2 >> 3;
		System.out.println(res2);
		
		int val3 = -17;
		int res3 = val3 >>1;
		System.out.println(res3);
		
		
//		-연산자 연습 사이트 : codingbat.com
		
	}

}
