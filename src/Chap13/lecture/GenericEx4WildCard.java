package Chap13.lecture;

import Chap13.textbook.s130601.*;

public class GenericEx4WildCard {
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<>("일반인", 5);
		Course<Student> courseStudent = new Course<>("학생", 5);
		
		Person p = new Person("일반");
		Student s = new Student("학생");
		
		p = s;                    
//		coursePerson = courseStudent;         //Student타입 ->>Person타입 형변환가능한데 이건 왜?
		
		courseStudent.add(new Student("hong"));  //윗줄이 된다면 이게안되야 하는데 됨, 그래서 윗줄 에러
		coursePerson.add(new Person("kim"));
		coursePerson.add(new Person("lee"));
		
		System.out.println("종료");
		System.out.println("wildcard");
		
		
		Course<? super Student> courseW0 = new Course<Object>("a", 1);
		Course<? super Student> courseW1 = new Course<Person>("a", 1);
		Course<? super Student> courseW2 = new Course<Student>("a", 1);
//		Course<? suepr Student> courseW3 = new Course<HighStudent>("a", 1);
//		super 뒤에 선언된 Student 클래스보다 상위클래스들은 해당 인스턴스형을 갖을수 있으므로 성립
		
		
		courseW1.add(new Student("a"));
		courseW2.add(new Student("a"));
		
		Course<? extends Student> courseW4 = new Course<Student>("a", 1);
		Course<? extends Student> courseW5 = new Course<HighStudent>("a", 1);
//		extends는 해당 클래스보다 하위클래스들을 모두받을수 있는 제네릭 타입
		
		Course<?> courseW6 = new Course<Person>("a", 1);
		Course<?> courseW7 = new Course<HighStudent>("a", 1);
		
//		?는 모든 클래스타입의 변수를 받을 수 있다.
		
		
	}
	
}
