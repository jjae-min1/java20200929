package chap14.textbook.s140501;
import java.util.function.*;
public class ConsumerExample {
	public static void main(String[] args) {
//		1개의 객체변수를 받는 Consumer
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		
//		2개의 객체변수를 받는 Consumer
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("java", "8");
		
//		double타입을 받는 Consumer
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
//		객체하나와 int하나를 받는 Consumer
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("java", 8);
	}

}
