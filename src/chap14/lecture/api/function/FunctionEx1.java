package chap14.lecture.api.function;

import java.util.function.Function;

public class FunctionEx1 {
	public static void main(String[] args) {
//		Function : �Է��� �Ű��������� ����ϴ� returnŸ�Կ� ��Ī����
//		����Ʈ�޼ҵ� : apply
		Function<String, Integer> strToint = s -> Integer.valueOf(s) * 2;
		int i = strToint.apply("30");
		System.out.println(i);
		
		Function<Integer, String> intTostr = x -> "��" + x;
		String str = intTostr.apply(5);
		System.out.println(str);
	}

}
