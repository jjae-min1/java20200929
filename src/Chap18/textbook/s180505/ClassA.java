package Chap18.textbook.s180505;

import java.io.Serializable;

public class ClassA implements Serializable{ 
	//serializable인터페이스를 상속받아야 해당 클래스 필드로 write,read 메소드 사용가능
	
	static final long serialBersionUID = 1L; //역직렬화시 클래스의 정보를 알려주는 식별자 값
//	 클래스내용 변경시 식별값이 달라지고 역직렬화시 해당 값이 다르면 오류 발생함
//	                      처음 컴파일시 자동생성되지만 재컴파일시 값이 달라지므로 선언하는것이 좋음
	
	
	int field1;
	ClassB field2 = new ClassB(); //다른클래스타입의 변수도 그 클래스가 serializable상속받아야
	static int field3;
	transient int field4;  //직렬화 되지 않음
	
}
