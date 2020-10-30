package chap14.textbook.s140501;
import java.util.function.*;
public class ConsumerExample {
	public static void main(String[] args) {
//		1���� ��ü������ �޴� Consumer
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		
//		2���� ��ü������ �޴� Consumer
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("java", "8");
		
//		doubleŸ���� �޴� Consumer
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
//		��ü�ϳ��� int�ϳ��� �޴� Consumer
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("java", 8);
	}

}
