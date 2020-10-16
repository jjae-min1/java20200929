package Chap07.lecture.abstractKeyword;

public class MyApp {
	public static void main(String[] args) {
		KindaCat o1 = new Cat();
		KindaCat o2 = new Tiger();
		
//		KindaCat o3 = new KindaCat(); abstract class이므로 해당 타입의 인스턴스 생성 불가
		
		o1.outPut();
		o2.outPut();
		
	}

}
