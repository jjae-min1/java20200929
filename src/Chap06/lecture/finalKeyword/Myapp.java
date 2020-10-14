package Chap06.lecture.finalKeyword;

public class Myapp {
	public static void main(String[] args) {
		int i;
		final int j;      //최초 한번만 변수에 값 할당 가능
		
		i = 30;
		i = 40;
		
		j = 20;
//		j = 10;      
		
		Myclass o1 = new Myclass();
		o1.field1 = 3;
//		o1.field2 = 4;
		
		System.out.println(Myclass.field3);
		System.out.println(Myclass.field4);
	}

}
