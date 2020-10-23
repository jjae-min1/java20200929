package Chap13.lecture;

import Chap13.textbook.s130601.*;

public class GenericEx4WildCard {
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<>("�Ϲ���", 5);
		Course<Student> courseStudent = new Course<>("�л�", 5);
		
		Person p = new Person("�Ϲ�");
		Student s = new Student("�л�");
		
		p = s;                    
//		coursePerson = courseStudent;         //StudentŸ�� ->>PersonŸ�� ����ȯ�����ѵ� �̰� ��?
		
		courseStudent.add(new Student("hong"));  //������ �ȴٸ� �̰ԾȵǾ� �ϴµ� ��, �׷��� ���� ����
		coursePerson.add(new Person("kim"));
		coursePerson.add(new Person("lee"));
		
		System.out.println("����");
		System.out.println("wildcard");
		
		
		Course<? super Student> courseW0 = new Course<Object>("a", 1);
		Course<? super Student> courseW1 = new Course<Person>("a", 1);
		Course<? super Student> courseW2 = new Course<Student>("a", 1);
//		Course<? suepr Student> courseW3 = new Course<HighStudent>("a", 1);
//		super �ڿ� ����� Student Ŭ�������� ����Ŭ�������� �ش� �ν��Ͻ����� ������ �����Ƿ� ����
		
		
		courseW1.add(new Student("a"));
		courseW2.add(new Student("a"));
		
		Course<? extends Student> courseW4 = new Course<Student>("a", 1);
		Course<? extends Student> courseW5 = new Course<HighStudent>("a", 1);
//		extends�� �ش� Ŭ�������� ����Ŭ�������� ��ι����� �ִ� ���׸� Ÿ��
		
		Course<?> courseW6 = new Course<Person>("a", 1);
		Course<?> courseW7 = new Course<HighStudent>("a", 1);
		
//		?�� ��� Ŭ����Ÿ���� ������ ���� �� �ִ�.
		
		
	}
	
}
