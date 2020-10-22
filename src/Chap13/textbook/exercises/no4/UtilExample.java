package Chap13.textbook.exercises.no4;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("È«±æµ¿", 35);
		Integer age = Util.getValue(pair, "È«±æµ¿");
		System.out.println(age);
		
		Pair<String, Integer> ChildPair = new Pair<>("È«»ï¿ø", 20);
		Integer childAge = Util.getValue(ChildPair, "È«»ï¼ø");
		System.out.println(childAge);
		
	} 

}
