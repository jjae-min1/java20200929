package Chap07.lecture.abstractKeyword;

public class MyApp {
	public static void main(String[] args) {
		KindaCat o1 = new Cat();
		KindaCat o2 = new Tiger();
		
//		KindaCat o3 = new KindaCat(); abstract class�̹Ƿ� �ش� Ÿ���� �ν��Ͻ� ���� �Ұ�
		
		o1.outPut();
		o2.outPut();
		
	}

}
