package Chap10.textbook.s100204;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) { //instanceof 연산자 사용 안하면 예외발생 할 수 있음
			Dog dog = (Dog) animal;
		}
	}
	
}
class Animal {}

class Dog extends Animal{};
class Cat extends Animal{};

