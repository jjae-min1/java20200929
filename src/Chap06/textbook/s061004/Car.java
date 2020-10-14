package Chap06.textbook.s061004;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로  달립니다.");
	}
	
	public static void main(String[] arg) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		System.out.println(Math.random());
		System.out.println(Math.abs(-3));  //절대값
	}

}
