package Chap07.lecture.abstractKeyword;

public class Cat extends KindaCat{
	@Override
	public String outPut() {
		System.out.println("캣 추상메소드실행");
		return "추상메소드";
	}

}
