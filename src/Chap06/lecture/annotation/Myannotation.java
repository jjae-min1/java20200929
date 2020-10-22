package Chap06.lecture.annotation;

import java.lang.annotation.*;


@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD}) // 메소드, 클래스, 필드
@Retention(RetentionPolicy.RUNTIME)
public @interface Myannotation {
	String value() default "123";
//	int number() defualt 3;
//	String[] names default {"a", "b"};

}
