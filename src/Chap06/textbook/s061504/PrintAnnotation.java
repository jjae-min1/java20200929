package Chap06.textbook.s061504;


import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default"-";
	int number() default 15;

}
