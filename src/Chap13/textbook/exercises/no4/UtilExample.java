package Chap13.textbook.exercises.no4;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("ȫ�浿", 35);
		Integer age = Util.getValue(pair, "ȫ�浿");
		System.out.println(age);
		
		Pair<String, Integer> ChildPair = new Pair<>("ȫ���", 20);
		Integer childAge = Util.getValue(ChildPair, "ȫ���");
		System.out.println(childAge);
		
	} 

}
