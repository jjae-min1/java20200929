package Chap09.textbook.exercises.no4;

public class NestedClasssExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
	}

}
