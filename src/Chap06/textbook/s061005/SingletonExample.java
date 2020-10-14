package Chap06.textbook.s061005;

public class SingletonExample {
	public static void main(String[] args) {
		
//		Singleton o1 = new Singleton();
//		Singleton o2 = new Singleton();
		
		Singleton obj1 = Singleton.Getinstance();
		Singleton obj2 = Singleton.Getinstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}

}
