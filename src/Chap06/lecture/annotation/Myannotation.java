package Chap06.lecture.annotation;

import java.lang.annotation.*;


@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD}) // �޼ҵ�, Ŭ����, �ʵ�
@Retention(RetentionPolicy.RUNTIME)
public @interface Myannotation {
	String value() default "123";
//	int number() defualt 3;
//	String[] names default {"a", "b"};

}
